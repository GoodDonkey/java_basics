package com.ddcodewithme;

import com.codewithme.UIControl;

public class TextBox extends UIControl {
    private String text = "";
    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }

    public void setText(String text) {
        var end = super.isEnabled;
        this.text = text;
    }

    public void clear() {
        text = "";

    }
}
