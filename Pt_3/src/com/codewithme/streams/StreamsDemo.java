package com.codewithme.streams;

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

        // peek(Consumer)
        movies.stream()
                .filter(m -> m.getLikes() > 10)
                .peek(m -> System.out.println("filtered: " + m.getTitle()))
                .map(Movie::getTitle)
                .peek(title -> System.out.println("mapped: " + title))
                .forEach(System.out::println);
    }
}
