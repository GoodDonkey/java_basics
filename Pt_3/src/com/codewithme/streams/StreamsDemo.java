package com.codewithme.streams;

import java.util.stream.IntStream;

public class StreamsDemo {
    public static void show() {
        IntStream.rangeClosed(1, 5)
                 .forEach(System.out::println);

        System.out.println("------------");

        IntStream.range(1, 5)
                .forEach(System.out::println);
    }
}
