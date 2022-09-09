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

import com.tp.boncoin.entity.Message;
import com.tp.boncoin.service.MessageService;

@RestController
@RequestMapping("/messages")
public class MessageController {

	@Autowired
	
	MessageService servicesM;
	
	@GetMapping("/allmessages")
	public List<Message> getAnnonce(){
		
		return servicesM.allUser();
	}
	
	@PostMapping("/allmessages")
	
	public Message postAnnonce(@RequestBody Message m) {
		return servicesM.sendUser(m);
		
	}
	
	@PutMapping("/allmessages")
	
	public Message putAnnonce(@RequestBody Message m) {
		
		return servicesM.modifyUser(m);
	}
	
	@DeleteMapping("/{id}")
	
	public void deleteAnnonce(@RequestParam int id) {
		servicesM.deleteUser(id);
		
		
	}
	
	@GetMapping("/list/{id}")
	
	public List<Message> getAllAnnonceById(@PathVariable int id ){
		
		return this.servicesM.allMessagesforEachAnnonce(id);
		
	}
	
	@GetMapping("/messagesannonce/{id}")
	
	public List<Message> getAnnonceByMessageId(@PathVariable int id){
		
		return this.servicesM.getAnnonceByMessageId(id);
		
	}
}
