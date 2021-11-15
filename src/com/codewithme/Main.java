package com.codewithme;

public class Main {
    public static void main(String[] args) {
        // for ~ each
        String[] fruits = {"Apple", "Mango", "Orange"};

        for (int i = 0; i < fruits.length; i++)
            System.out.println(fruits[i]);

        // enhenced for loop
        for (String fruit : fruits)
            System.out.println(fruit);

        // enhenced for loop는 아래와 같이 작아지는 방향으로는 불가능하다.
        for (int j = fruits.length - 1; j >= 0; j--)
            System.out.println(fruits[j]);

        // 또한 item의 index를 뽑을 수 없으므로 그럴땐 일반적인 for loop을 사용해야한다.
    }
}