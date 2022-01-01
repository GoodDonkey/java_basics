package com.codewithme.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class StreamsDemo {
    public static void show() {
        // Collection 은 stream을 사용할 수 있다.
        Collection<Integer> x = null;
//        x.stream();

        // List 를 정의하면 stream을 사용할 수 있다.
        var list = new ArrayList<>();
//        list.stream();

        // array 자체는 stream 메서드가 없다.
        // 대신 Arrays 클래스를 이용한다.
        int[] numbers = {1, 2, 3};
//        numbers.stream();
        Arrays.stream(numbers)
                .forEach(n -> System.out.println(n));
    }
}
