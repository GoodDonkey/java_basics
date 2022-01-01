package com.codewithme.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void show() {
        var movies = List.of(
                new Movie("b", 10),
                new Movie("a", 20),
                new Movie("c", 30),
                new Movie("d", 20),
                new Movie("e", 40)
        );

        // Collectors.toList(), toSet()... 을 사용할 수 있다.
        List<Movie> result = movies.stream()
                                   .filter(m -> m.getLikes() > 10)
                                   .collect(Collectors.toList());

        Set<Movie> result2 = movies.stream()
                                   .filter(m -> m.getLikes() > 10)
                                   .collect(Collectors.toSet());

        // title: likes 인 Map
        // toMap(keyMapper, valueMapper)
        Map<String, Integer> result3 = movies.stream()
                                             .filter(m -> m.getLikes() > 10)
                                             .collect(Collectors.toMap(Movie::getTitle, Movie::getLikes));

        // value 로 Movie 객체를 담고 싶다면
        Map<String, Movie> result4 = movies.stream()
                                           .filter(m -> m.getLikes() > 10)
                                           .collect(Collectors.toMap(Movie::getTitle, m -> m));

        // Function.identity(): 객체를 받아서 그대로 반환하는 메서드. 위와 같은 표현.
        Map<String, Movie> result5 = movies.stream()
                                           .filter(m -> m.getLikes() > 10)
                                           .collect(Collectors.toMap(Movie::getTitle, Function.identity()));

        // Collectors.summingInt(ToIntFunction): mapper 함수를 이용해 int를 반환하는 Collector 객체 반환
        // summingDouble, summingLong 등도 있다.
        Integer result6 = movies.stream()
                                .filter(m -> m.getLikes() > 10)
                                .collect(Collectors.summingInt(Movie::getLikes));

        // Collectors.summarizingInt(ToIntFunction): mapper 함수를 이용해 요약통계치를 가진 객체를 반환하는 Collector객체 반환.
        // summarizingDouble, summarizingLong 도 있다.
        IntSummaryStatistics result7 = movies.stream()
                                             .filter(m -> m.getLikes() > 10)
                                             .collect(Collectors.summarizingInt(Movie::getLikes));

        System.out.println(result); // Movie 객체가 담겨있다
        System.out.println(result2); // Movie 객체가 담겨있다
        System.out.println(result3); // key value 로 담겨있다
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);

        // Collectors.joining(): String 을 합쳐서 반환하는 Collector 객체 반환. delimiter 줄 수 있다.
        String result8 = movies.stream()
                               .filter(m -> m.getLikes() > 10)
                               .map(Movie::getTitle)
                               .collect(Collectors.joining(","));
        System.out.println(result8);


    }
}
