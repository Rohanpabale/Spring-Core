package com.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private List<Integer> marks;
	private Set<String> name;
	private Map<Integer, String> idName;

	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	public Set<String> getName() {
		return name;
	}

	public void setName(Set<String> name) {
		this.name = name;
	}

	public Map<Integer, String> getIdName() {
		return idName;
	}

	public void setIdName(Map<Integer, String> idName) {
		this.idName = idName;
	}

}
