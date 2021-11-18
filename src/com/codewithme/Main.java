package com.codewithme;

public class Main {

    public static void main(String[] args) {
        var textBox1 = new TextBox(); // var를 쓰면 부른 클래스의 타입을 찾아 정의함.
        textBox1.setText("Box 1");
        System.out.println(textBox1.text);

        var textBox2 = new TextBox();
        textBox2.setText("Box 2");
        System.out.println(textBox2.text);
    }
}