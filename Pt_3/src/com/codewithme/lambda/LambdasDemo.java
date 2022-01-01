package com.codewithme.lambda;

import java.util.function.Function;

public class LambdasDemo {

    public static void show() {
        Function<String, Integer> map = str -> str.length();
        var length = map.apply("Sky");
        System.out.println(length);
    }
}
