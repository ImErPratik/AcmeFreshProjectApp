package com.AcmeFresh.project.service;



import com.AcmeFresh.project.Model.Cart;




public interface Cart_Interface {
	
	public Cart addItemToCart(Integer cartid, Integer itemname) ;

	public Cart saveCart(Cart cart);

	public Cart viewCartByCartId(Integer cartId);

	public Cart removeCart(Integer cartId);
	

}
