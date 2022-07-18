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

import com.AcmeFresh.project.Model.Customers_M;
import com.AcmeFresh.project.service.Costumer_Service;



@RestController
public class Customers_C {
	
	@Autowired
	private Costumer_Service client;
	


	@PostMapping("/acmefresh/customer")
	public ResponseEntity<Customers_M> storeUser(@RequestBody Customers_M u){
		
		Customers_M cm = client.addUser(u);
		
		
		return new ResponseEntity<Customers_M>(cm, HttpStatus.OK);
	}
	
	@GetMapping("/acmefresh/customer/{id}")
    public ResponseEntity<Customers_M>	 getUserById(@PathVariable("id") Integer  userId ){
		
    	Customers_M u =  client.findUserById(userId);
		
		if(u!=null) {
			return new ResponseEntity<Customers_M> (u, HttpStatus.OK);
		}
		
		return null;
	}
	
	@PutMapping("/acmefresh/customer/{id}")
	public ResponseEntity<Customers_M> updateUser(@RequestBody Customers_M u, @PathVariable("id") Integer id){
		
		Customers_M cm = client.updatePassword(id, u);
		
		return new ResponseEntity<Customers_M>(cm, HttpStatus.OK);
	}
	
	@DeleteMapping("/acmefresh/customer/{id}")
	public ResponseEntity<Customers_M> deleteUser(@PathVariable("id") Integer id){
		
		Customers_M cm = client.deleteUserbyId(id);
		
		return new ResponseEntity<Customers_M>(cm, HttpStatus.OK);
	}
	

}
