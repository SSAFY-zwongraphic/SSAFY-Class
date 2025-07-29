package com.ssafy.day04.c_polymorphism;

import com.ssafy.day03.a_inheritance.person.Person;
import com.ssafy.day03.a_inheritance.person.SpiderMan;

public class AppropriateParameter {
	public void useJump1(Object obj) {
		if (obj instanceof Person casted) {
			casted.jump();
		}
	}

	public void useJump2(Person person) {
		person.jump();
	}

	public void useJump3(SpiderMan spiderMan) {
		spiderMan.jump();
	}

	public static void main(String[] args) {
		Object obj = new Object();
		Person person = new Person();
		SpiderMan sman = new SpiderMan();

		AppropriateParameter ap = new AppropriateParameter();
		// TODO:ap의 useJumpX를 obj, person, sman으로 호출해보세요.
		ap.useJump1(obj);
		ap.useJump1(person);
		ap.useJump1(sman);
		System.out.println();
		ap.useJump2(person);
		ap.useJump2(sman);
		System.out.println();
//		ap.useJump3((SpiderMan) person);
		ap.useJump3(sman);
		// END
	}

}
