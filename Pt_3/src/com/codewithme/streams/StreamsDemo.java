package com.codewithme.streams;

import java.util.Comparator;
import java.util.List;

public class StreamsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("b", 10),
                new Movie("a", 20),
                new Movie("c", 30),
                new Movie("d", 20),
                new Movie("e", 40)
        );

        // Comparator 객체를 lambda 로 정의
        movies.stream()
              .sorted((a, b) -> a.getTitle()
                                 .compareTo(b.getTitle()))
              .sorted(Comparator.comparing(m -> m.getTitle()))
              .sorted(Comparator.comparing(Movie::getTitle))
              .forEach(m -> System.out.println(m.getTitle()));

        // Comparator.comparing() 사용
        System.out.println("--------");
        movies.stream()
              .sorted(Comparator.comparing(Movie::getTitle))
              .forEach(m -> System.out.println(m.getTitle()));

        // descending sorting
        System.out.println("--------");
        movies.stream()
              .sorted(Comparator.comparing(Movie::getTitle).reversed())
              .forEach(m -> System.out.println(m.getTitle()));
    }
}
