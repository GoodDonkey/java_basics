package com.codewithme;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String message = "Hello World" + "!!";

        // class이기 때문에 String의 멤버 메소드 사용 가능.
        System.out.println(message.endsWith("!!")); // "!!"로 끝나는지 true, false를 반환.
        System.out.println(message.length());
        System.out.println(message.indexOf("e")); // 위치 반환
        System.out.println(message.indexOf("sky")); // 없으면 -1을 반환.
        System.out.println(message.replace("!", "*")); // !를 *로 바꾼다.
        System.out.println(message.toLowerCase(Locale.ROOT)); //
        System.out.println(message.toUpperCase(Locale.ROOT)); //

        message = "    Hello World" + "!!    ";
        System.out.println(message);
        System.out.println(message.trim()); // 양쪽 whitespace를 자름.


    }
}