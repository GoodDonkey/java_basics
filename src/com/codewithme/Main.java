package com.codewithme;

public class Main {

    public static void main(String[] args) {
        String role = "admin";

        switch (role) {
            case "admin":
                System.out.println("You're an admin");
                break;
            case "moderator":
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
        }

        // 위 switch문은 아래의 if 문과 같다.
        if (role == "admin")
            System.out.println("You're an admin");
        else if (role == "moderator")
            System.out.println("You're a moderator");
        else
            System.out.println("You're a guest");
    }
}