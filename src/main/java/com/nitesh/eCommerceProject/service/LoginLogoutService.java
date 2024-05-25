package com.nitesh.eCommerceProject.service;

import com.nitesh.eCommerceProject.dto.CustomerDTO;
import com.nitesh.eCommerceProject.dto.SellerDTO;
import com.nitesh.eCommerceProject.dto.SessionDTO;
import com.nitesh.eCommerceProject.entity.UserSession;


public interface LoginLogoutService {
	
	public UserSession loginCustomer(CustomerDTO customer);
	
	public SessionDTO logoutCustomer(SessionDTO session);
	
	public void checkTokenStatus(String token);
	
	public void deleteExpiredTokens();
	
	
	public UserSession loginSeller(SellerDTO seller);
	
	public SessionDTO logoutSeller(SessionDTO session);
	
	
}
