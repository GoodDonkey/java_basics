package com.codewithme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for (int i = 5; i > 0; i--)
            System.out.println("Hello World" + i);

        // 위 for 문을 while문으로 표현: 이 경우, for문이 더 깔끔.
        int i = 5;
        while (i > 0) {
            System.out.println("Hello World" + i);
            i--;
        }
    }
}