package com.tp.boncoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tp.boncoin.entity.User;
import com.tp.boncoin.repository.UserRepository;

@Service
public class UserServices {
	
	@Autowired
	
	UserRepository users; 
	
	public List<User> allUser(){
		return users.findAll();
		}
	
	public User sendUser(User u) {
		
		return users.save(u);
		
	}
	
	public User modifyUser(User u ) {
		
		User newuser = users.findById(u.getId()).orElse(null)  ;
		
		newuser.setFirst_name(u.getFirst_name());
		newuser.setLast_name(u.getLast_name());
		newuser.setTelephone(u.getTelephone());
		newuser.setEmail(u.getEmail());
	
		
		users.save(newuser);
		return newuser;
	}
	
	public String deleteUser(int id) {
		
		if(users.findById(id).orElse(null) !=null) {
			
			users.deleteById(id);
		}
		return "id not found" + id ;
		
	}
	

}
