package com.AcmeFresh.project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AcmeFresh.project.Model.Product_M;
import com.AcmeFresh.project.repository.Product_Repo;

@Service
public class Product_S implements Product_I {
	
	@Autowired
	private Product_Repo pr;

	@Override
	public Product_M addProduct(Product_M tech) {
		return pr.save(tech);

	}

	@Override
	public Product_M getProductList(String name) {
		
		Optional<Product_M> pg = pr.findByName(name);
		
		if(pg.isPresent()) {
			return pg.get();
		}
		
		return null;
	}

}
