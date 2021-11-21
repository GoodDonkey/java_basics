package com.codewithme;

public class Main {

    public static void main(String[] args) {
        var textBox = new TextBox();
        textBox.setText("Hello World");
        System.out.println(textBox.toString()); // overriding한 toString()을 사용한다.
        System.out.println(textBox); // println()은 자동적으로 toString()을 불러 출력하므로 굳이 쓰지않아도 toString()이 사용된다.

    }

}
