package com.tp.boncoin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tp.boncoin.entity.Annonce;

public interface AnnonceRepository extends JpaRepository<Annonce , Integer> {

	
	// exract all rows by given id in parameter 
	@Query("SELECT a FROM Annonce a WHERE a.idUser = :id ")
	public List<Annonce> getAnnounceOfGivenUser(@Param("id") int id); 
	
	// Extract all annonce greater then the price we give in paramter 
	@Query("SELECT a FROM Annone a WHERE a.price > :price")
	public List<Annonce> getAnnonceByPrice(@Param("price") int price);
}
