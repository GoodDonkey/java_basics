package com.codewithme;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        // 받은 숫자를 그대로 프린트하기. quit을 받으면 while문이 끝남.
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase(Locale.ROOT);
            System.out.println(input);
        }
    }
}