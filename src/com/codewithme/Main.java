package com.codewithme;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        // formatting
        // percent
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result = percent.format(0.1);
        System.out.println(result);
    }
}