package com.codewithme.lambda;

import java.util.function.Predicate;

public class LambdasDemo {

    public static void show() {
        var testString = "key:value";

        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");

        Predicate<String> hasLeftAndRightBraces = hasLeftBrace.and(hasRightBrace);
        System.out.println(hasLeftAndRightBraces.test(testString));

        Predicate<String> or = hasLeftBrace.or(hasRightBrace);
        System.out.println(or.test(testString));

        Predicate<String> negate = hasLeftBrace.negate();
        System.out.println(negate.test(testString));

    }
}
