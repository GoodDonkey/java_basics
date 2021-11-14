package com.codewithme;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        // formatting
        // 포매팅을 위해 factory method를 객체화한다.
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        // 이 객체를 사용해 숫자를 포매팅한다.
        String result = currency.format(1234567.891);
        System.out.println(result);
    }
}