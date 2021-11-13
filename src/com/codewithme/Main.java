package com.codewithme;

public class Main {

    public static void main(String[] args) {
        // Math Class: round
        int result = Math.round(1.1F);
        System.out.println(result);

        // ceiling
        int result2 = (int)Math.ceil(1.1F);
        System.out.println(result2); // 2

        // floor
        int result3 = (int)Math.floor(1.1F);
        System.out.println(result3); // 1

        // max
        int result4 = Math.max(1, 2);
        System.out.println(result4); // 2

        // min
        int result5 = Math.min(1, 2);
        System.out.println(result5); // 1

        // random
        double result6 = Math.random();
        System.out.println(result6);  // 0과 1 사이의 실수를 반환

        // random
        double result7 = Math.random() * 100;
        System.out.println(result7);  // 0과 100 사이의 실수를 반환

        // random
        int result8 = (int)Math.round(Math.random() * 100); // implicit casting이 되지 않으므로 explicit casting 해준다.
        System.out.println(result8);  // 0과 100 사이의 정수를 반환

        // random
        int result9 = (int) Math.random() * 100; // random 에 casting되어 0이므로
        System.out.println(result9); // 항상 0 이다.

        // random
        int result10 = (int) (Math.random() * 100); // 묶어주면 항상 0이 아님.
        System.out.println(result10);
    }
}