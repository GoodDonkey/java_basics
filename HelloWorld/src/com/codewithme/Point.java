package com.codewithme;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        // o 가 null인지 확인하고, 아니라면 현재 클래스와 o의 클래스가 다르면 false를 반환해라
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) // 같으면 아래의 과정으로 true가 반환되지만 바로 객체를 비교해서 같으면 true 가 반환되도록 한다.
//            return true;
//        if (!(obj instanceof Point)) // Point 객체가 아니면 false를 반환
//            return false;
//
//        var other = (Point) obj; // Point object 로 casting
//        return other.x == x && other.y == y;
//    }
//
//    // 같은 인자가 들어가면 같은 hashcode를 갖도록 Override 하였다.
//    @Override
//    public int hashCode() {
//        return Objects.hash(x, y);
//    }
}
