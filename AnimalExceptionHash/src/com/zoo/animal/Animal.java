package com.zoo.animal;

public class Animal {
	protected String name;

	public void say() {
		System.out.println("Я умею говорить!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
