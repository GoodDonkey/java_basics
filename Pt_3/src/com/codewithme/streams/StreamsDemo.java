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

        // distinct()
        movies.stream()
              .map(Movie::getLikes)
              .distinct()
              .forEach(System.out::println);
    }
}
