package com.AcmeFresh.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AcmeFresh.project.Model.Clients_M;

@Repository
public interface Client_Repo extends JpaRepository<Clients_M, Integer>{
	
	public Optional<Clients_M> findByUserNameAndUserPassword(String userName, String password);

}
