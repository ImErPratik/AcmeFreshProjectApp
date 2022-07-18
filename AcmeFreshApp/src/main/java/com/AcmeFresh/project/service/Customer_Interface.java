package com.AcmeFresh.project.service;


import com.AcmeFresh.project.Model.Customers_M;

public interface Customer_Interface {
	
	public Customers_M addUser(Customers_M user);
	
	public Customers_M findUserById(Integer user_Id);
	
	public Customers_M findByUsernameAndPassword(String userName,String userPassword);

	public Customers_M updatePassword(Integer user_id, Customers_M user);
	
	public Customers_M deleteUserbyId(Integer user_id);

}
