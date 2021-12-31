package com.codewithme.generics;

public class User implements Comparable<User> {
    private int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User other) {
        // User를 point로 비교한다고 가정해보자.
        // this < o     -> -1
        // this == o    -> 0
        // this > o     -> 1
        return points - other.points; // 이와 같이 정의하고 동작은 call할 때 정의한다.
    }

    @Override
    public String toString() {
        return "Points=" + points;
    }
}
