package com.codewithme;

public class Main {

    public static void main(String[] args) {
        // explicit casting (automatic casting)
        // byte > short > int > long > float > double
        String x = "1"; // String이리면
        int y = Integer.parseInt(x) + 2; // 이렇게 int로 casting해줘야 한다.
        System.out.println(y);
    }
}