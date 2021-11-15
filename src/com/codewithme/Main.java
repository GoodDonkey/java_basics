package com.codewithme;

public class Main {

    public static void main(String[] args) {

        /* 오류
        int income = 120_000;
        if (income > 100_000) {
            boolean hasHighIncome = true; // if 안에서만 동작
        }
        System.out.println(hasHighIncome);
        */

//        -----------

       /*  1. 미리 선언하면 if 밖에서도 사용할 수 있다.
        int income = 120_000;
        boolean hasHighIncome;
        if (income > 100_000)
            hasHighIncome = true;
        else
            hasHighIncome = false;
        System.out.println(hasHighIncome);
        */

//        ---------

        /* 2. 변수 기본값을 false로 해두면 else문을 쓰지 않아도 된다.
        int income = 120_000;
        boolean hasHighIncome = false;
        if (income > 100_000)
            hasHighIncome = true;
        System.out.println(hasHighIncome);
        */

        // 결론: if 문을 쓰자 않아도 된다.
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000); // logical statement는 () 로 감싸는 것이 더 읽기 좋다.
        System.out.println(hasHighIncome);

    }
}