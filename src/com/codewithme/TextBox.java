package com.codewithme;

public class TextBox extends UIControl {
    private String text = "";

//    public TextBox() {
//        super(true);
//        System.out.println("TextBox initialized");
//    }


    @Override
    public void render() {
        System.out.println("Render TextBox");
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
