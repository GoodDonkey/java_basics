package com.codewithme.streams;

import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        // arbitrary number of objects
        Stream.of(1, 2, 3, 4);

        // generate() 메서드
        // Supplier 이용: call 할때마다 랜덤 숫자가 나옴.
        var stream = Stream.generate(() -> Math.random());
        stream.limit(3)
              .forEach(n -> System.out.println(n));

        // iterate() 메서드
        Stream.iterate(1, n -> n + 1)
              .limit(10)
              .forEach(n -> System.out.println(n));
    }
}
