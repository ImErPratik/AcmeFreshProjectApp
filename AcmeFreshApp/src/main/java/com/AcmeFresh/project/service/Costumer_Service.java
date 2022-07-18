package com.AcmeFresh.project.service;

import java.util.Optional;

import org.springframework.stereotype.Service;


import com.AcmeFresh.project.Model.Customers_M;
import com.AcmeFresh.project.repository.Customers_Repo;

@Service
public class Costumer_Service implements Customer_Interface{
	
	private Customers_Repo repo;

	@Override
	public Customers_M addUser(Customers_M user) {
		return repo.save(user);
	
	}

	@Override
	public Customers_M findUserById(Integer user_Id) {
		Optional<Customers_M> oc  =repo.findById(user_Id);
		if(oc.isPresent()) {
			return oc.get();
		}
		return null;
	}

	@Override
	public Customers_M findByUsernameAndPassword(String userName, String userPassword) {
		Optional<Customers_M> oc = repo.findByUserNameAndUserPassword(userName, userPassword);
		if(oc.isPresent()) {
			return oc.get();
		}
		return null;
	}

	@Override
	public Customers_M updatePassword(Integer user_id, Customers_M user) {
		Optional<Customers_M> us = repo.findById(user_id);
		
		if(us.isPresent()) {
			
			return repo.save(user);
		}
		
		return null;
	}

	@Override
	public Customers_M deleteUserbyId(Integer user_id) {
		Optional<Customers_M> us = repo.findById(user_id);
		
		if(us.isPresent()) {
			Customers_M u = us.get();
			
			repo.delete(u);
			
			return u;
		}
		
		return null;
	}

}
