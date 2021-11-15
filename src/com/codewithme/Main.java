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
            if (input.equals("pass")) // pass를 입력받으면 다음 loop로 진행한다.
                continue;
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }
    }
}