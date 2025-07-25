package com.ssafy.day04.b_singleton;

class SingletonClass {
	// TODO:SingletonClass에 Singleton Design Pattern을 적용하시오.

	private static SingletonClass instance = new SingletonClass();

	private SingletonClass() {
	} // 생성자가 막혀있다

	public static SingletonClass getInstance() {
		return instance;
	}

	// END
	public void sayHello() {
		System.out.println("Hello");
	}

}

public class SingletonTest {
	public static void main(String[] args) {
		// TODO:SingletonClass를 사용해보세요.
//	  SingletonClass sc = new SingletonClass(); //싱글턴 디자인에서는 불가
		SingletonClass sc1 = SingletonClass.getInstance();
		sc1.sayHello();
		SingletonClass sc2 = SingletonClass.getInstance();
		System.out.println(sc1 == sc2);
		// END
	}
}
