package com.tp.boncoin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tp.boncoin.entity.Annonce;
import com.tp.boncoin.service.AnnonceService;


@RestController
@RequestMapping("/annonces")
public class AnnonceController {
	
	@Autowired

	AnnonceService services;
	
	
	@GetMapping("/allannonce")
	public List<Annonce> getAnnonce(){
		
		return services.allAnnonce();
	}
	
	@PostMapping("/allannonce")
	
	public Annonce postAnnonce(@RequestBody Annonce a) {
		return services.sendAnnonce(a);
		
	}
	
	@PutMapping("/allannonce")
	
	public Annonce putAnnonce(@RequestBody Annonce a) {
		
		return services.modifyAnnonce(a);
	}
	
	@DeleteMapping("/{id}")
	
	public void deleteAnnonce(@RequestParam int id) {
		services.deleteAnnonce(id);
		
		
	}
	
	@GetMapping("/list/{id}")
	
	public List<Annonce> getListOfEachUser(@PathVariable int id){
		
		return this.services.getAllAnnonceOfUser(id);
	}
	
	@GetMapping("/pricelist/{price}")
	
	public List<Annonce> getListOfAnnonceByPrice(@PathVariable int price){
		return this.services.getDataByPrice(price);
	}
	
	@GetMapping("/title/{title}")
	
	public List<Annonce> getAnnonceByTitle(@PathVariable String title){
		
		return this.services.getAnnonceByTitle(title);
	}
}
