package com.codewithme;

import org.w3c.dom.Text;

public class Main {

    public static void main(String[] args) {
        var control = new TextBox();
        control.disable();
        System.out.println(control.isEnabled());
    }

}
