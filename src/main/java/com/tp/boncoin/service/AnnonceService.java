package com.tp.boncoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp.boncoin.entity.Annonce;
import com.tp.boncoin.repository.AnnonceRepository;

@Service
public class AnnonceService {

	
	@Autowired
	
	AnnonceRepository annonces; 
	
	
	public List<Annonce> allAnnonce(){
		return annonces.findAll();
		}
	
	public Annonce sendAnnonce(Annonce a) {
		
		return annonces.save(a);
		
	}
	
	public Annonce modifyAnnonce(Annonce a ) {
		
		Annonce newannonce = annonces.findById(a.getId()).orElse(null)  ;
		
		newannonce.setTitle(a.getTitle());
		newannonce.setDescription(a.getDescription());
		newannonce.setIdUser(a.getIdUser());
		newannonce.setPrice(a.getPrice());
		newannonce.setDatePublication(a.getDatePublication());
		
		annonces.save(newannonce);
		return newannonce;
	}
	
	public String deleteAnnonce(int id) {
		
		if(annonces.findById(id).orElse(null) !=null) {
			
			annonces.deleteById(id);
		}
		return "id not found" + id ;
		
	}
	
	public List<Annonce> getAllAnnonceOfUser(int id ){
		
		return this.annonces.getAnnounceOfGivenUser(id);
	}
	
	public List<Annonce> getDataByPrice(int price){
		
		return this.annonces.getAnnonceByPrice(price);
	}
}
