package com.ssafy.day02.a_person;

public class Person {
	String name;
	int age;
	boolean isHungry;

	void eat() {
		System.out.println("냠냠");
		isHungry = false;
	}

	void work() {
		System.out.println("열일");
		isHungry = true;
	}

	void printInfo() {
		System.out.println(name + ": " + age);
	}
}
