package com.nitesh.eCommerceProject.exception;

public class ProductNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 7067902714277051856L;

	public ProductNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductNotFoundException(String message){
		super(message);
	}
}
