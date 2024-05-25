package com.nitesh.eCommerceProject.service;

import java.util.List;

import com.nitesh.eCommerceProject.dto.CustomerDTO;
import com.nitesh.eCommerceProject.dto.CustomerUpdateDTO;
import com.nitesh.eCommerceProject.dto.SessionDTO;
import com.nitesh.eCommerceProject.entity.Address;
import com.nitesh.eCommerceProject.entity.CreditCard;
import com.nitesh.eCommerceProject.entity.Customer;
import com.nitesh.eCommerceProject.entity.Order;
import com.nitesh.eCommerceProject.exception.CustomerException;
import com.nitesh.eCommerceProject.exception.CustomerNotFoundException;

public interface CustomerService {
	
	public Customer addCustomer(Customer customer) throws CustomerException;
	
	public Customer getLoggedInCustomerDetails(String token) throws CustomerNotFoundException;
	
	public List<Customer> getAllCustomers(String token) throws CustomerNotFoundException;
	
	public Customer updateCustomer(CustomerUpdateDTO customer, String token) throws CustomerNotFoundException;
	
	public Customer updateCustomerMobileNoOrEmailId(CustomerUpdateDTO customerUpdateDTO, String token) throws CustomerNotFoundException;
	
	public Customer updateCreditCardDetails(String token, CreditCard card) throws CustomerException;
	
	public SessionDTO updateCustomerPassword(CustomerDTO customerDTO, String token) throws CustomerNotFoundException;
	
	public SessionDTO deleteCustomer(CustomerDTO customerDTO, String token) throws CustomerNotFoundException;
	
	public Customer updateAddress(Address address, String type, String token) throws CustomerException;
	
	public Customer deleteAddress(String type, String token) throws CustomerException, CustomerNotFoundException;

	public List<Order> getCustomerOrders(String token) throws CustomerException; 

}
