package com.codewithme;

public class Main {

    public static void main(String[] args) {

        /*
        // 기본값을 Economy로 주고 선언하기까지만 가능. logical statement를 직접 변수에 넣을 수 없다.
        int income = 120_000;
        String className = "Economy";
        if (income > 100_000)
            className = "First";
        */

        // Ternary Operator를 사용해 boolean 값에 따른 출력값을 지정. -> ?, :
        int income = 120_000;
        String className = income > 100_000 ? "First" : "Economy";

    }
}