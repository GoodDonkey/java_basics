package com.codewithme;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        // formatting
        // percent
        String result = NumberFormat.getPercentInstance().format(0.1); // method chaining
        System.out.println(result);
    }
}