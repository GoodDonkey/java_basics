package com.codewithme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Reading Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are " + age);
    }
}