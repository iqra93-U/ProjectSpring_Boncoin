package com.tp.boncoin.entity;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="messages")

public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int Id;
	
	private int idAnnonce;
	private int idSaller;
	private int idBuyer;
	private String text;
	
	@JsonFormat(pattern="yyyy-MM-dd")
    private Date date = new Date();
	
	
	
	public Message() {
		super();
	}



	public Message(int id, int idAnnonce, int idSaller, int idBuyer, String text, Date date) {
		super();
		Id = id;
		this.idAnnonce = idAnnonce;
		this.idSaller = idSaller;
		this.idBuyer = idBuyer;
		this.text = text;
		this.date = date;
	}



	public int getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
	}



	public int getIdAnnonce() {
		return idAnnonce;
	}



	public void setIdAnnonce(int idAnnonce) {
		this.idAnnonce = idAnnonce;
	}



	public int getIdSaller() {
		return idSaller;
	}



	public void setIdSaller(int idSaller) {
		this.idSaller = idSaller;
	}



	public int getIdBuyer() {
		return idBuyer;
	}



	public void setIdBuyer(int idBuyer) {
		this.idBuyer = idBuyer;
	}



	public String getText() {
		return text;
	}



	public void setText(String text) {
		this.text = text;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	} 
	
	
	

}
