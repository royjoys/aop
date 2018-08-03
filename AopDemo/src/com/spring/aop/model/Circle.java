package com.spring.aop.model;
public class Circle {
	private String name;

	public String getName() {
		//System.out.println("In Getter"+name);
		//throw new RuntimeException();
		return name;
	}

	public void setName(String name) {
		//System.out.println("In Setter"+name);
		//throw new RuntimeException();
		this.name = name;
	}
	
	public String getValue(){
		System.out.println("In getValue=="+name);
		return name;
	}

}
