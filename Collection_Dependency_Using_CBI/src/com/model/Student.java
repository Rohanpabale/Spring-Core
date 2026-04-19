package com.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private List<Integer> marks;
	private Set<String> name;
	private Map<Integer, String> idName;

	public Student(List<Integer> marks, Set<String> name, Map<Integer, String> idName) {
		super();
		this.marks = marks;
		this.name = name;
		this.idName = idName;
	}

	public Student() {
		super();
	}

	public List<Integer> getMarks() {
		return marks;
	}

	public Set<String> getName() {
		return name;
	}

	public Map<Integer, String> getIdName() {
		return idName;
	}
	
	

}
