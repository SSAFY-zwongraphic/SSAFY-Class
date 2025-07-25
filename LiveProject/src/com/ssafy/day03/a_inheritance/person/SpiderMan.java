package com.ssafy.day03.a_inheritance.person;

public class SpiderMan extends Person {
	Spider spider = new Spider();
	boolean isSpider;

	public SpiderMan(String name, boolean isSpider) {
		super(name);
		this.isSpider = isSpider;
	}
	
	@Override
	void jump() {
		if (isSpider) {
			spider.jump();
		} else {
			super.jump();
		}
	}
	
	void fireWeb() {
		if (isSpider) {
			spider.fireWeb();
		} else {
			System.out.println("사람은 안 되지~");
		}
	}
}
