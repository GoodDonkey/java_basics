package com.codewithme;

public class Main {

    public static void main(String[] args) {
        var textBox1 = new TextBox();
        var textBox2 = textBox1; // TextBox 클래스라는 것을 파악함.
        // 즉, 이 경우 하나의 heap 주소를 두개의 변수가 가리키고 있는 것.
        // 그러므로 하나의 객체로 값을 바꾸면 다른 하나도 바뀐다.
        textBox2.setText("Hello World");
        System.out.println(textBox1.text);

    }
}