package com.ssafy.day06.a_generic.box;

public class UseBoxTest {

	public static void main(String[] args) {
		useNormalBox();
		useGenericBox();
		useNumberBox();
	}

	private static void useNormalBox() {
		// TODO: NormalBox 타입의 객체를 생성하고 사용해보세요.
		NormalBox nbox = new NormalBox();
		nbox.setSome(1);
		nbox.setSome("Hello");

		Object obj = nbox.getSome();
		if (obj instanceof String str) {
			System.out.println(obj + ": " + str.length());
		}
		// END
	}

	private static void useGenericBox() {
		// TODO: GenericBox 타입의 객체를 생성하고 사용해보세요.

		// END
	}

	private static void useNumberBox() {
		// TODO: NumberBox 타입의 객체를 생성하고 사용해보세요.

		// END
	}

}

// 수업 때 실습 다 못따라 감 ㅜ