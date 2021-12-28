package com.codewithme;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static double readNumber(String prompt) {
        // validation 없이 인풋을 읽어서 반환한다.
        return scanner.nextDouble();

    }
    public static double readNumber(String prompt, double min, double max) {
        // 값을 validation 하여 반환한다.
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }
}
