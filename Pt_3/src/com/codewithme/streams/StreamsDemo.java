package com.codewithme.streams;

import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
        stream.flatMap(list -> list.stream()) // list의 stream객체를 반환하도록 정의하면, 개별 원소를 가지는 stream이 된다.
              .forEach(n -> System.out.println(n));
    }
}
