package com.codewithme.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30),
                new Movie("d", 20),
                new Movie("e", 40)
        );

        //limit()
        System.out.println("-----drop-----");
        movies.stream()
              .limit(2)
              .forEach(m -> System.out.println(m.getTitle()));

        // skip()
        System.out.println("-----skip-----");
        movies.stream()
              .skip(2) // 2개를 생략한다.
              .forEach(m -> System.out.println(m.getTitle()));

//         - pagination
//         1000 movies
//         10 movies per page
//         3rd page 를 보고싶다.
//         skip(20) = skip( (page - 1) x pageSize)
//         limit(10) = limit(pageSize)
        movies.stream()
              .skip(20)
              .limit(10)
              .forEach(m -> System.out.println(m.getTitle()));

        // takeWhile: 30 미만인 것이 올 때까지만 값을 계속 넘긴다.
        System.out.println("-----takeWhile-----");
        movies.stream()
              .takeWhile(m -> m.getLikes() < 30)
              .forEach(m -> System.out.println(m.getTitle()));

        // dropWhile
        System.out.println("-----dropWhile-----");
        movies.stream()
              .dropWhile(m -> m.getLikes() < 30)
              .forEach(m -> System.out.println(m.getTitle()));
    }
}
