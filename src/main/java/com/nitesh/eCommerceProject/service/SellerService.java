package com.nitesh.eCommerceProject.service;

import java.util.List;

import com.nitesh.eCommerceProject.dto.SellerDTO;
import com.nitesh.eCommerceProject.dto.SessionDTO;
import com.nitesh.eCommerceProject.entity.Seller;
import com.nitesh.eCommerceProject.exception.SellerException;

public interface SellerService {
	
	public Seller addSeller(Seller seller);
	
	public List<Seller> getAllSellers() throws SellerException;
	
	public Seller getSellerById(Integer sellerId)throws SellerException;
	
	public Seller getSellerByMobile(String mobile, String token) throws SellerException;
	
	public Seller getCurrentlyLoggedInSeller(String token) throws SellerException;
	
	public SessionDTO updateSellerPassword(SellerDTO sellerDTO, String token) throws SellerException;
	
	public Seller updateSeller(Seller seller, String token)throws SellerException;
	
	public Seller updateSellerMobile(SellerDTO sellerdto, String token)throws SellerException;
	
	public Seller deleteSellerById(Integer sellerId, String token)throws SellerException;

}
