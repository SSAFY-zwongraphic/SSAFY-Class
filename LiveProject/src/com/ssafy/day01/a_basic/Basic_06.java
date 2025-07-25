package com.ssafy.day01.a_basic;

public class Basic_06 {
    public static void main(String[] args) {

        int i = 1024;
        // 기본형 --> 참조
        Integer iw = Integer.valueOf(i);
        Integer iw2 = i; // autoboxing
        System.out.printf("두 객체는 같은 객체? ==: %b, equals:%b\n", iw == iw2, iw.equals(iw2)); // -128 부터 127까지는 캐싱되어 있음

        // 참조형 --> 기본
        int i2 = iw.intValue();
        int i3 = iw; // unboxing
        System.out.println("두 값은 같은 값? " + (i2 == i3));

        // 기본형 --> 문자열
        String s1 = String.valueOf(i);
        String s2 = "" + i; // 결합 연산
        System.out.println("두 문자열은 같은 객체? " + (s1 == s2));

        // 문자열 --> 기본형
        int i4 = Integer.parseInt(s1);
        System.out.println(i4);

        // 참조형 --> 문자열
        String s3 = iw.toString();
        String s4 = "" + iw;
        System.out.println("두 문자열은 같은 객체? " + (s3 == s4));

        // 문자열 --> 참조형
        Integer iw3 = Integer.valueOf(s4);
        Integer iw4 = Integer.parseInt(s4);
        System.out.println(iw3 + " : " + iw4);

    }
}
