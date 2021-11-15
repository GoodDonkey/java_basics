package com.codewithme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 5로 나누어 떨어지면 Fizz
        // 3으로 나누어 떨어지면 Buzz
        // 5 또는 3으로 나누어 떨어지면 FizzBuzz
        // 모두 아니면 숫자 그대로
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");

        // input
        String numberInput = scanner.next().trim();

        // initialization
        int number = Integer.parseInt(numberInput);
        String printing = numberInput;
        boolean isDiv5 = false;

        if (number % 5 == 0) {
            printing = "Fizz";
            isDiv5 = true;
        }
        if (number % 3 == 0) {
            if (isDiv5) printing = printing.concat("Buzz");
            else
                printing = "Buzz";
        }

        System.out.println(printing);

    }
}