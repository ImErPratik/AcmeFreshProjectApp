package com.AcmeFresh.project.service;

import com.AcmeFresh.project.Model.Clients_M;

public interface Client_Interface {
	
	public Clients_M addUser(Clients_M user);
	
	public Clients_M findUserById(Integer user_Id);
	
	public Clients_M findByUsernameAndPassword(String userName,String userPassword);

	public Clients_M updatePassword(Integer user_id, Clients_M user);
	
	public Clients_M deleteUserbyId(Integer user_id);

}
