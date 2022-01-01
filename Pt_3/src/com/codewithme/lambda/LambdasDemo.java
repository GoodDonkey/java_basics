package com.codewithme.lambda;

public class LambdasDemo {
    public static void show() {
        // lambda expression 을 이용한 메서드 정의
        greet(message -> System.out.println(message));

        // 변수에 담을 수도 있다.
        Printer printer = message -> System.out.println(message);
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
