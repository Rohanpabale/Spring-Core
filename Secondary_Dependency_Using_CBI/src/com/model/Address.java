package com.model;

public class Address {
	private String city;
	private String state;

	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;

	}

	public Address() {
		super();
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

}
