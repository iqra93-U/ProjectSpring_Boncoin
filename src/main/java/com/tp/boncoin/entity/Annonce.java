package com.tp.boncoin.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity

public class Annonce {
	
	@Id
	@GeneratedValue
	
	
	private int id ; 
	private String title ; 
	private String description ; 
	private int idUser;
	private Double price; 
	private Date datePublication ;
	
	
	
	
	
	
	public Annonce() {
		super();
	}



	public Annonce(int id, String title, String description, int idUser, Double price, Date datePublication) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.idUser = idUser;
		this.price = price;
		this.datePublication = datePublication;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getIdUser() {
		return idUser;
	}



	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}



	public Double getPrice() {
		return price;
	}



	public void setPrice(Double price) {
		this.price = price;
	}



	public Date getDatePublication() {
		return datePublication;
	}



	public void setDatePublication(Date datePublication) {
		this.datePublication = datePublication;
	} 
	

	
}
