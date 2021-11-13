package com.codewithme;

import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // multidimensional array
        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        System.out.println(Arrays.toString(numbers)); // 주소값만 준다.
        System.out.println(Arrays.deepToString(numbers));

    }
}