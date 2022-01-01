package com.codewithme.streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        Predicate<Movie> isPopular = m -> m.getLikes() > 10;
        movies.stream()
              .filter(isPopular)
              .peek(m -> System.out.println(m.getLikes()))
              .forEach(m -> System.out.println(m.getTitle()));
    }
}
