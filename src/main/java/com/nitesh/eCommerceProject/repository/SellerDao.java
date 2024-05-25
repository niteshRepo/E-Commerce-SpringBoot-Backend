package com.nitesh.eCommerceProject.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nitesh.eCommerceProject.entity.Seller;


public interface SellerDao extends JpaRepository<Seller, Integer> {
	
	Optional<Seller> findByMobile(String mobile);
	
}
