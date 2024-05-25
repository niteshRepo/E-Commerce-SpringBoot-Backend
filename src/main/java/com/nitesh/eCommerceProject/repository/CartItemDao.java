package com.nitesh.eCommerceProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nitesh.eCommerceProject.entity.CartItem;

public interface CartItemDao extends JpaRepository<CartItem, Integer>{

}
