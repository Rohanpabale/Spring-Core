package com.model;

import org.springframework.context.annotation.Primary;

@Primary // by default uses byType hence it searching for the address
public class Address {
	private String city;
	private String state;
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
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	public Address() {
		super();
	}
	
	
}
