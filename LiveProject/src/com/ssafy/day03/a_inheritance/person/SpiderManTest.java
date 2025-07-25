package com.ssafy.day03.a_inheritance.person;

public class SpiderManTest {

    public static void main(String[] args) {
    	SpiderMan sman = new SpiderMan("피터파커", true);
    	
    	sman.isSpider = true;
    	
    	sman.eat();
    	
    	sman.jump();
    	sman.fireWeb();
    }
}
