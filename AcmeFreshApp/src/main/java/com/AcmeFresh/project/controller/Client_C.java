package com.AcmeFresh.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AcmeFresh.project.Model.Clients_M;
import com.AcmeFresh.project.service.Client_service;



@RestController
public class Client_C {
	
	@Autowired
	private Client_service client;
	


	@PostMapping("/acmefresh/client")
	public ResponseEntity<Clients_M> storeUser(@RequestBody Clients_M u){
		
		Clients_M cm = client.addUser(u);
	
		
		return new ResponseEntity<Clients_M>(cm, HttpStatus.OK);
	}
	
	@GetMapping("/acmefresh/client/{id}")
    public ResponseEntity<Clients_M>	 getUserById(@PathVariable("id") Integer  userId ){
		
    	Clients_M u =  client.findUserById(userId);
		
		if(u!=null) {
			return new ResponseEntity<Clients_M> (u, HttpStatus.OK);
		}
		
		return null;
	}
	
	@PutMapping("/acmefresh/client/{id}")
	public ResponseEntity<Clients_M> updateUser(@RequestBody Clients_M u, @PathVariable("id") Integer id){
		
		Clients_M cm = client.updatePassword(id, u);
		
		return new ResponseEntity<Clients_M>(cm, HttpStatus.OK);
	}
	
	@DeleteMapping("/acmefresh/client/{id}")
	public ResponseEntity<Clients_M> deleteUser(@PathVariable("id") Integer id){
		
		Clients_M cm = client.deleteUserbyId(id);
		
		return new ResponseEntity<Clients_M>(cm, HttpStatus.OK);
	}
	

}
