package com.codewithme.lambda;

public class LambdasDemo {
    public LambdasDemo(String message) {
        System.out.println(message + " in constructor");
    }

    public static void print2(String message) {
        System.out.println(message);
    }

    public void show() {
        greet(message -> new LambdasDemo(message));
        greet(LambdasDemo::new); // Printer 객체 = print() 메서드 구현 = LambdasDemo 생성자
        greet(LambdasDemo::print2); // Printer 객체 = print() 메서드 구현 = print2() 메서드
    }

    public void greet(Printer printer) {
        printer.print("Hello World");
    }
}
