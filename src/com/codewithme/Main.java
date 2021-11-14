package com.codewithme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Reading Input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");

//        String name = scanner.next(); // 하나의 토큰만 받는다.
//        System.out.println("You are " + name);

//        String name2 = scanner.nextLine(); // 한 줄 전체를 받는다 (공백포함)
//        System.out.println("You are " + name2);

        String name3 = scanner.nextLine().trim(); // 한 줄 전체를 받는다 (좌우 공백제외)
        System.out.println("You are " + name3);

    }
}