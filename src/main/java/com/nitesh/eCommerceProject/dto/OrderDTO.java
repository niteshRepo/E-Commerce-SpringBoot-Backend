package com.nitesh.eCommerceProject.dto;

import jakarta.persistence.Embedded;
import jakarta.validation.constraints.NotNull;

import org.hibernate.validator.constraints.CreditCardNumber;

import com.nitesh.eCommerceProject.entity.CreditCard;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class OrderDTO {
	
	@NotNull
	@Embedded
	private CreditCard cardNumber;
	@NotNull
	private String addressType;
	public CreditCard getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(CreditCard cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	
	
}
