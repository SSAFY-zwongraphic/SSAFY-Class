package com.ssafy.day03.a_inheritance.person;

public class Person {
	String name;
	
	public Person() {}
	
	public Person(String name) {
		this.name = name;
	}
	
	@Deprecated
	void eat() {
		System.out.println("냠냠");
	}
	
	public void jump() {
		System.out.println("폴짝");
	}
}
