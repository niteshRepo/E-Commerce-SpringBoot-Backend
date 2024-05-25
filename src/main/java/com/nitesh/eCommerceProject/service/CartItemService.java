package com.nitesh.eCommerceProject.service;

import com.nitesh.eCommerceProject.dto.CartDTO;
import com.nitesh.eCommerceProject.entity.CartItem;

public interface CartItemService {
	
	public CartItem createItemforCart(CartDTO cartdto);
	
}
