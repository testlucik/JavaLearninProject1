package com.tekwillacademy.operationsandciclingfunctions;

public class IncrementDecrementExample {
    public static void main(String[] args) {

        int a = 89;
        int b = 34;
        System.out.println(a++);
        System.out.println(a);

        System.out.println(++b);


        a = a + 1;
        System.out.println(a);

        System.out.println(a--);
        System.out.println(a);

        System.out.println(--b);

        b = --a;
        System.out.println(b);
        System.out.println(a);


    }
}
