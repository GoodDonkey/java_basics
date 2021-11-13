package com.codewithme;

import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // array: int array인 number를 길이 5로 정의
        int[] numbers = { 2, 3, 5, 1, 4};
        System.out.println(numbers.length); // fixed length
        System.out.println(Arrays.toString(numbers)); // int[]는 int로 initialize

        Arrays.sort(numbers); // 정렬하기
        System.out.println(Arrays.toString(numbers)); // int[]는 int로 initialize

    }
}