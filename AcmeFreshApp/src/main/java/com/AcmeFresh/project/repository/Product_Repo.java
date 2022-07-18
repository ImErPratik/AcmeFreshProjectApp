package com.AcmeFresh.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.AcmeFresh.project.Model.Product_M;

@Repository
public interface Product_Repo extends JpaRepository<Product_M, Integer> {
	
	public Optional<Product_M> findByName(String name);

}
