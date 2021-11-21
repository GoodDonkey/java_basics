package com.codewithme;

public class TextBox extends UIControl{
    // extends 로 UIControl 의 기능을 상속받는다.
    private String text = "";  // Field

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";

    }
}
