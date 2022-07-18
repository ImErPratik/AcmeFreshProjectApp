package com.AcmeFresh.project.service;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AcmeFresh.project.Model.Cart;
import com.AcmeFresh.project.Model.Product_M;
import com.AcmeFresh.project.repository.Cart_Repo;

import com.AcmeFresh.project.repository.Product_Repo;


@Service
public class Cart_S implements Cart_Interface {

	@Autowired
	private Cart_Repo cr;
	
	@Autowired
	private Product_Repo ri;



	@Override
	public Cart addItemToCart(Integer cartid, Integer itemname) {
		
		Optional<Cart> cart = cr.findById(cartid);
		
		if(cart.isPresent()) {

			
			Optional<Product_M> item = ri.findById(itemname);

			if(item.isPresent()) {
				Cart c = cart.get();
				
				List<Product_M> lis = new ArrayList<>();
				
				lis.addAll(c.getProduct());
				lis.add(item.get());
				
				c.setProduct(lis);
				
				return c;
				
			}
		}
		
		return null;
	}

	@Override
	public Cart saveCart(Cart cart) {
		
		return cr.save(cart);
		
	}

	@Override
	public Cart viewCartByCartId(Integer cartId) {
		Optional<Cart> f=cr.findById(cartId);
		   if(f.isPresent()) {
	       	Cart existingcart= f.get();
	       	
	       	return existingcart;
		   }
		return null;
	}

	@Override
	public Cart removeCart(Integer cartId) {
		
		   Optional<Cart> f=cr.findById(cartId);
		   if(f.isPresent()) {
	       	Cart existingcart= f.get();
	       	
	       	cr.delete(existingcart);
	       	
	       	return existingcart;
	       	
	       	
		   }
		   return null;
	}

	

}
