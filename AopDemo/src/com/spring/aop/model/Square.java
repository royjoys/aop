package com.spring.aop.model;
public class Square {
	private String name;

	public String getName() {
		System.out.println("In "+name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
