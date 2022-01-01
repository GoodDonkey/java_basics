package com.codewithme.streams;

import java.util.List;

public class StreamsDemo {
    public static void show() {
        var movies = List.of(
            new Movie("a", 10),
            new Movie("b", 20),
            new Movie("c", 30)
        );

        // Movie의 제목만 얻고 싶다.
        movies.stream() // Movie 객체를 가져온다.
              .map(movie -> movie.getTitle()) // Movie 객체의 title 값을 가져온다.
              .forEach(name -> System.out.println(name)); // title 을 프린트 한다.

        // mapToInt: 반환타입이 int
        movies.stream()
              .mapToInt(movie -> movie.getLikes())
              .forEach(likes -> System.out.println(likes));
    }
}
