package com.codewithme;

public class Main {

    public static void main(String[] args) {
        // explicit casting
        // byte > short > int > long > float > double
        String x = "1.1";
        Double y = Double.parseDouble(x) + 2;
        System.out.println(y);
    }
}