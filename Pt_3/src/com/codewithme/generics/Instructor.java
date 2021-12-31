package com.codewithme.generics;

public class Instructor extends User{

    // User에 정의된 constructor에서 받는 type parameter를 정해주어야 한다.
    public Instructor(int points) {
        super(points);
    }
}
