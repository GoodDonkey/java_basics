package com.codewithme.lambda;

import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class LambdasDemo {

    public static void show() {
        List<String> list = List.of("a", "b", "c");
        Consumer<String> print = item -> System.out.println(item);
        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase(Locale.ROOT));

        list.forEach(print.andThen(printUpperCase).andThen(print)); // print 함수 실행 후 printUpperCase 실행한다.
    }
}
