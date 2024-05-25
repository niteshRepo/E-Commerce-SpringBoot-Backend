package com.nitesh.eCommerceProject.service;

import com.nitesh.eCommerceProject.dto.CartDTO;
import com.nitesh.eCommerceProject.entity.Cart;
import com.nitesh.eCommerceProject.exception.CartItemNotFound;
import com.nitesh.eCommerceProject.exception.ProductNotFoundException;




public interface CartService {
	
	public Cart addProductToCart(CartDTO cart, String token) throws CartItemNotFound;
	public Cart getCartProduct(String token);
	public Cart removeProductFromCart(CartDTO cartDto,String token) throws ProductNotFoundException;
//	public Cart changeQuantity(Product product,Customer customer,Integer quantity);
	
	public Cart clearCart(String token);
	
}
