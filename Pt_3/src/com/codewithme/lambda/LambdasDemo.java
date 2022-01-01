package com.codewithme.lambda;

import java.util.function.BinaryOperator;
import java.util.function.Function;

public class LambdasDemo {

    public static void show() {
        // binary operator: 2 operands, 1 result
        var x = 1 + 2;

        // a, b -> a + b -> square
        BinaryOperator<Integer> add = (a, b) -> a + b; // 자동 boxing 됨.
        Function<Integer, Integer> square = a -> a * a;

        var result = add.andThen(square).apply(1, 2);
        System.out.println(result);
    }
}
