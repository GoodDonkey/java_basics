package com.codewithme.streams;

import java.util.List;
import java.util.Optional;

public class StreamsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("b", 10),
                new Movie("a", 20),
                new Movie("c", 30),
                new Movie("d", 20),
                new Movie("e", 40)
        );

        // [10, 20, 30, 20, 40]
        // [30, 30, 20, 40]
        // [60, 20, 40]
        // [80, 40]
        // [120]
        // reduce(BinaryOperator)
        Optional<Integer> sum = movies.stream()
                                      .map(m -> m.getLikes())
                                      .reduce((a, b) -> a + b);
        System.out.println(sum.orElse(0));

        // method reference로 표현
        Optional<Integer> sum2 = movies.stream()
                                       .map(Movie::getLikes)
                                       .reduce(Integer::sum);
        System.out.println(sum2.orElse(0));

        // reduce(T, BinaryOperator): 첫 값을 지정해 줄 수 있다. T 타입의 값을 반환하게 된다.
        // 만약 stream의 원소가 없다면 첫 값을 그대로 반환하게 된다.
        Integer sum3 = movies.stream()
                             .map(Movie::getLikes)
                             .reduce(0, Integer::sum);
        System.out.println(sum3);
    }
}
