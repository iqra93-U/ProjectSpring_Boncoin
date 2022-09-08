package com.tp.boncoin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tp.boncoin.entity.User;
import com.tp.boncoin.service.UserServices;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	
	UserServices servicesU;
	
	@GetMapping("/allusers")
	public List<User> getAnnonce(){
		
		return servicesU.allUser();
	}
	
	@PostMapping("/allusers")
	
	public User postAnnonce(@RequestBody User u) {
		return servicesU.sendUser(u);
		
	}
	
	@PutMapping("/allusers")
	
	public User putAnnonce(@RequestBody User u) {
		
		return servicesU.modifyUser(u);
	}
	
	@DeleteMapping("/{id}")
	
	public void deleteAnnonce(@RequestParam int id) {
		servicesU.deleteUser(id);
		
		
	}
	

}
