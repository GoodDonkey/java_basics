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

        // 기본적으로 value는 List 로 반환된다.
        Map<Genre, List<Movie>> result = movies.stream()
                                               .collect(Collectors.groupingBy(Movie::getGenre));
        System.out.println(result);

        // value를 Set으로 반환되도록 만들 수 있다.
        Map<Genre, Set<Movie>> result2 = movies.stream()
                                               .collect(Collectors.groupingBy(Movie::getGenre,
                                                                              Collectors.toSet()));
        System.out.println(result2);

        // 그루핑 하고 value 는 개수로
        Map<Genre, Long> result3 = movies.stream()
                                         .collect(Collectors.groupingBy(Movie::getGenre,
                                                                        Collectors.counting()));
        System.out.println(result3);

        // 그루핑하고 value는 title을 ", " 로 합치기
        Map<Genre, String> result4 = movies.stream()
                                           .collect(Collectors.groupingBy(Movie::getGenre,
                                                                          Collectors.mapping(Movie::getTitle,
                                                                                             Collectors.joining(
                                                                                                     ", "))));
        System.out.println(result4);

    }
}
