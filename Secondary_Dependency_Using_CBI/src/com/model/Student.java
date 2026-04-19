package com.model;

public class Student {
	private int id;
	private String name;
	private Address address;

	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;

	}

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

}
