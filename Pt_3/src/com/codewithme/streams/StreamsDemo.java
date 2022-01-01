package com.codewithme.streams;

import java.util.Comparator;
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

        // long count(): 개수
        var count = movies.stream()
                          .filter(m -> m.getLikes() >= 30)
                          .count();
        System.out.println(count);

        // boolean anyMatch(): 조건을 만족하는 원소가 있는가?
        var anyMatch = movies.stream()
                             .anyMatch(m -> m.getLikes() > 20);
        System.out.println(anyMatch);

        // boolean allMatch(): 모든 원소가 조건을 만족하는가?
        var allMatch = movies.stream()
                             .allMatch(m -> m.getLikes() > 20);
        System.out.println(allMatch);

        // noneMatch(): 모두 만족하지 않는가?
        var noneMatch = movies.stream()
                              .noneMatch(m -> m.getLikes() > 50);
        System.out.println(noneMatch);

        // findFirst(): 첫번째 객체를 반환. Optional wrapper 로 감싸서
        var findFirst = movies.stream()
                              .findFirst();
        System.out.println(findFirst.get()
                                    .getTitle());

        // findAny()
        var findAny = movies.stream()
                            .findAny();
        System.out.println(findAny.get()
                                  .getTitle());

        // max(): comparator 에 정의된 기준으로 가장 큰 값을 가진 객체를 반환
        var max = movies.stream()
                        .max(Comparator.comparing(Movie::getLikes));
        System.out.println(max.get()
                              .getTitle() + " has likes of " + max.get()
                                                                  .getLikes());


    }
}
