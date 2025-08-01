package com.ssafy.day01.a_basic;

import java.util.ArrayList;

public class Basic_01 {

    public static void main(String[] args) {
        int i = 10;
        double d = 3.14;
        System.out.printf("i = %d, d = %f\n", i, d);

        // var v; // 로컬 변수로만 사용되며 할당까지 같이 진행되어야 함
        var a = 1;
        var str = "Hello";
        var list2 = new ArrayList<>(); // type은 Object로 추론
        var list3 = new ArrayList<String>();
        list2.add(1);
        list2.add("Hello");
        // list3.add(1); // 타입은 String으로 추론되어서 에러 발생
        System.out.printf("a = %d, str = %s , list2: %s, list3: %s\n", a, str, list2, list3);
    }
}
