package com.ssafy.day04.d_object;

public class EqualsTest {

    public static void main(String[] args) {
        Integer [] is = {1, 1, 128, 128};

        for(int i=0; i<is.length; i+=2) {
            System.out.printf("%d, ==? %b, equals? %b%n", i, is[i]==is[i+1], is[i].equals(is[i+1]));
        }
        
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = obj2;
        
        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));
        
        System.out.println(obj2 == obj3);
        System.out.println(obj2.equals(obj3));
    }
}
