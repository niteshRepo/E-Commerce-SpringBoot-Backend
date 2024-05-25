package com.nitesh.eCommerceProject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer addressId;
	
	@Pattern(regexp = "[A-Za-z0-9\\s-]{3,}", message = "Not a valid street no")
	private String streetNo;
	
	@Pattern(regexp = "[A-Za-z0-9\\s-]{3,}", message = "Not a valid building name")
	private String buildingName;
	
	@NotNull
	@Pattern(regexp = "[A-Za-z0-9\\s-]{3,}", message = "Not a valid locality name")
	private String locality;
	
	@NotNull(message = "City name cannot be null")
	@Pattern(regexp = "[A-Za-z\\s]{2,}", message = "Not a valid city name")
	private String city;
	
	@NotNull(message = "State name cannot be null")
	private String state;
	
	@NotNull(message = "Pincode cannot be null")
	@Pattern(regexp = "[0-9]{6}", message = "Pincode not valid. Must be 6 digits")
	private String pincode;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	private Customer customer;


	public Integer getAddressId() {
		return addressId;
	}


	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}


	public String getStreetNo() {
		return streetNo;
	}


	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}


	public String getBuildingName() {
		return buildingName;
	}


	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}


	public String getLocality() {
		return locality;
	}


	public void setLocality(String locality) {
		this.locality = locality;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
	
}
