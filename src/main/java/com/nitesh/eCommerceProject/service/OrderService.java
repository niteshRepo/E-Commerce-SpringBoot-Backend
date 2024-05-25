package com.nitesh.eCommerceProject.service;

import java.time.LocalDate;
import java.util.List;

import com.nitesh.eCommerceProject.dto.OrderDTO;
import com.nitesh.eCommerceProject.entity.Customer;
import com.nitesh.eCommerceProject.entity.Order;
import com.nitesh.eCommerceProject.exception.LoginException;
import com.nitesh.eCommerceProject.exception.OrderException;

public interface OrderService {
	public Order saveOrder(OrderDTO odto,String token) throws LoginException, OrderException;
	
	public Order getOrderByOrderId(Integer OrderId) throws OrderException;
	
	public List<Order> getAllOrders() throws OrderException;
	
	public Order cancelOrderByOrderId(Integer OrderId,String token) throws OrderException;
	
	public Order updateOrderByOrder(OrderDTO order,Integer OrderId,String token) throws OrderException,LoginException;
	
	public List<Order> getAllOrdersByDate(LocalDate date) throws OrderException;

	public Customer getCustomerByOrderid(Integer orderId) throws OrderException;
	
	//public Customer getCustomerIdByToken(String token) throws CustomerNotFoundException;
	

	
}
