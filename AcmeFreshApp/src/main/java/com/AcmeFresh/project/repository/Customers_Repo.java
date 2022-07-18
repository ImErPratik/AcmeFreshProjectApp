package com.AcmeFresh.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.AcmeFresh.project.Model.Customers_M;

@Repository
public interface Customers_Repo extends JpaRepository<Customers_M, Integer> {
	
	public Optional<Customers_M> findByUserNameAndUserPassword(String userName, String password);


}
