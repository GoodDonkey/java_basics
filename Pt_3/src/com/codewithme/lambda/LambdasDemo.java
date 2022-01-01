package com.codewithme.lambda;

import java.util.function.Function;

public class LambdasDemo {

    public static void show() {
        // "key:value"
        // first: "key=value"
        // second: "{key=value}"
        // third: "({key=value})"
        Function<String, String> replacecolon = str -> str.replace(":", "=");
        Function<String, String> addCurlyBraces = str -> "{" + str + "}";
        Function<String, String> addRoundBraces = str -> "(" + str + ")";

        // Declarative Programming
        var result = replacecolon.andThen(addCurlyBraces)
                                 .andThen(addRoundBraces)
                                 .apply("key:value");
        var result2 = replacecolon.andThen(addCurlyBraces)
                                  .andThen(addCurlyBraces)
                                  .andThen(addCurlyBraces)
                                  .andThen(addCurlyBraces)
                                  .apply("key:value");

        // 순서 위와 같다.
        var result3 = addRoundBraces.compose(addCurlyBraces)
                                    .compose(replacecolon)
                                    .apply("key:value");

        // 순서 틀림
        var result4 = addCurlyBraces.compose(addRoundBraces)
                                    .compose(replacecolon)
                                    .apply("key:value");

        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
