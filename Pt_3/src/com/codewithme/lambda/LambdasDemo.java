package com.codewithme.lambda;

public class LambdasDemo {
    public static void print(String message) {}
    public void print2(String message) {}

    public void show() {
        // static 메서드를 정의하여 lambda 를 method reference 하기
        greet(message -> print(message));
        greet(LambdasDemo::print);

        // instance method의 경우
        var demo = new LambdasDemo();
        greet(message -> demo.print(message));
        greet(demo::print2);
    }

    public void greet(Printer printer) {
        printer.print("Hello World");
    }
}
