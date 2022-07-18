package com.AcmeFresh.project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AcmeFresh.project.Model.Clients_M;
import com.AcmeFresh.project.repository.Client_Repo;


@Service
public class Client_service implements Client_Interface {
	
	@Autowired
	private Client_Repo client_A;

	@Override
	public Clients_M addUser(Clients_M user) {
		
		return client_A.save(user);
	}

	@Override
	public Clients_M findUserById(Integer user_Id) {
		
		Optional<Clients_M> ob = client_A.findById(user_Id);
		if(ob.isPresent()) {
			return ob.get();
		}
		
		return null;
	}

	@Override
	public Clients_M findByUsernameAndPassword(String userName, String userPassword) {
		Optional<Clients_M> ob = client_A.findByUserNameAndUserPassword(userName, userPassword);
		if(ob.isPresent()) {
			return ob.get();
		}
		
		return null;
	}

	@Override
	public Clients_M updatePassword(Integer user_id, Clients_M user) {
		Optional<Clients_M> us = client_A.findById(user_id);
		
		if(us.isPresent()) {
			
			return client_A.save(user);
		}
		
		return null;
	}

	@Override
	public Clients_M deleteUserbyId(Integer user_id) {
		Optional<Clients_M> us = client_A.findById(user_id);
		
		if(us.isPresent()) {
			Clients_M u = us.get();
			
			client_A.delete(u);
			
			return u;
		}
		
		return null;
	}

}
