package com.codewithme;

public class TextBox extends UIControl {
    private String text = "";
    public TextBox() {
        super(true);
        System.out.println("TextBox initialized");
    }

    @Override
    public String toString() {
        return text;
    }

    public void setText(String text) {
        var end = super.isEnabled;
        this.text = text;
    }

    public void clear() {
        text = "";

    }
}
