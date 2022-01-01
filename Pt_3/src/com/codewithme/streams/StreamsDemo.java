package com.codewithme.streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("b", 10, Genre.THRILLER),
                new Movie("a", 20, Genre.THRILLER),
                new Movie("c", 30, Genre.ACTION),
                new Movie("d", 20, Genre.ACTION),
                new Movie("e", 40, Genre.ACTION)
        );

        Map<Boolean, String> result = movies.stream()
                                            .collect(Collectors.partitioningBy(m -> m.getLikes() > 20,
                                                                               Collectors.mapping(Movie::getTitle,
                                                                                                  Collectors.joining(
                                                                                                          ", "))));
        System.out.println(result);

    }
}
