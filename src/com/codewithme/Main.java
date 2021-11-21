package com.codewithme;

public class Main {

    public static void main(String[] args) {
        var point1 = new Point(1, 2);
        var point2 = new Point(1, 2);
        System.out.println(point1.equals(point2));
        System.out.println(point1 == point2);

        // equals로 Point가 아닌 객체 비교할 경우 오류가 나므로 예외처리를 해둠
        System.out.println(point1.equals(new TextBox()));

        // 자기 자신을 비교하면 true
        System.out.println(point1.equals(point1));

        // 같은 인자가 들어가면 같은 hashcode를 갖도록 Override 하였다.
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());
    }

}
