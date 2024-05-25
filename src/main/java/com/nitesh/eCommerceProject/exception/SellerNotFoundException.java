package com.nitesh.eCommerceProject.exception;

public class SellerNotFoundException extends RuntimeException{
	
	public SellerNotFoundException() {
		super();
	}
	
	
	public SellerNotFoundException(String message) {
		super(message);
	}
}
