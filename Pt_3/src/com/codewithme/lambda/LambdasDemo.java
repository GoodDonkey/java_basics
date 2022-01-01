package com.codewithme.lambda;

public class LambdasDemo {
    private String prefix = "-";

    public void show() {
        String prefix2 = "!";

        // lambda expression 을 이용한 메서드 정의
        greet(message -> System.out.println(prefix + message));
        prefix = "*";
        greet(message -> System.out.println(prefix + message));

        // 변수에 담을 수도 있다.
        final Printer printer = message -> System.out.println(prefix2 + message);
//        prefix2 = "@"; // lambda가 사용하는 지역 변수 prefix2 는 변경되어서는 안됨.
        greet(printer);
    }

    public void greet(Printer printer) {
        printer.print("Hello World");
    }
}
