package com.codewithme;

public class TextBox extends UIControl{
    // extends 로 UIControl 의 기능을 상속받는다.
    private String text = "";  // Field

    public TextBox() {
        super(true); // UIControl 클래스가 기본적으로 isEnabled라는 파라미터를 받아 초기화 되므로
        // super 키워드를 사용해 정의된 constructor 에 맞게 초기화 되도록 명시한다.

        // 상속받는 UIControl 클래스가 initialize 된 후 TextBox가 initialize된다.
        System.out.println("TextBox");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";

    }
}
