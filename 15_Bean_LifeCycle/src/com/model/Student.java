package com.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("101")
	private int id;
	@Value("shyam")
	private String name;
	
	//------------------------------------------------------------------------------------
	// bean lifecycle
	@PostConstruct
	public void init() {
		System.out.println("init get called");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy get called");
	}
	//--------------------------------------------------------------------------------

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Student() {
		super();
	}
}
