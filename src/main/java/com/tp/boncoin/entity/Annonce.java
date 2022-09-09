package com.tp.boncoin.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity

public class Annonce {
	
	@Id
	@GeneratedValue
	
	
	private int id ; 
	private String title ; 
	private String description ; 
	private int idUser;
	private int price; 
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date datePublication = new Date() ;
	
	
	
	
	
	
	public Annonce() {
		super();
	}



	public Annonce(int id, String title, String description, int idUser, int price, Date datePublication) {
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



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public Date getDatePublication() {
		return datePublication;
	}



	public void setDatePublication(Date datePublication) {
		this.datePublication = datePublication;
	} 
	

	
}
