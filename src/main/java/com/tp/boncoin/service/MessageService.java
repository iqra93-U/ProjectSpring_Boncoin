package com.tp.boncoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp.boncoin.entity.Message;
import com.tp.boncoin.repository.MessageRepository;

@Service
public class MessageService {
	
	@Autowired
	
	MessageRepository messages;
	
	public List<Message> allUser(){
		return messages.findAll();
		}
	
	public Message sendUser(Message m) {
		
		return messages.save(m);
		
	}
	
	public Message modifyUser(Message m ) {
		
		Message newMessage = messages.findById(m.getId()).orElse(null)  ;
		
		newMessage.setText(m.getText());
	
	
		
		messages.save(newMessage);
		return newMessage;
	}
	
	public String deleteUser(int id) {
		
		if(messages.findById(id).orElse(null) !=null) {
			
			messages.deleteById(id);
		}
		return "id not found" + id ;
		
	}
	
	public List<Message> allMessagesforEachAnnonce(int id){
		
		return this.messages.getMessageById(id);
	}
	
	public List<Message> getAnnonceByMessageId(int id ){
		
		return this.messages.getMessagebyAnnonceId(id);
	}

}
