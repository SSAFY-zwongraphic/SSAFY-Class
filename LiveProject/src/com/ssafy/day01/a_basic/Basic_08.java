package com.ssafy.day01.a_basic;

public class Basic_08 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println((a > b) & (b > 0));

        System.out.println((a += 10) > 15 | (b -= 10) > 15);
        System.out.println("a = " + a + ", b = " + b);

        a = 10;
        b = 20;
        System.out.println((a += 10) > 15 || (b -= 10) > 15);
        System.out.println("a = " + a + ", b = " + b);
    }
}
