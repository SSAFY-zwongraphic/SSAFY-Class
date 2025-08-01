package com.ssafy.day02.a_person;

public class PersonTest {
	public static void main(String[] args) {
//		int a = 10;

		Person p1 = new Person();
		p1.name = "홍길동";
		p1.isHungry = true;
		System.out.println(p1.name + ": " + p1.isHungry);
		p1.eat();
		System.out.println(p1.name + ": " + p1.isHungry);
		p1.printInfo();
		
		Person p2 = new Person();
		p1.name = "임꺽정";
		p1.isHungry = false;
		p2.printInfo();
	}
}
