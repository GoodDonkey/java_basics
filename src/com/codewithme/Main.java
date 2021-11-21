package com.codewithme;

import org.w3c.dom.Text;

public class Main {

    public static void main(String[] args) {
        var box1 = new TextBox();
        var box2 = box1;
        var box3 = new TextBox();

        // hashCode()
        System.out.println(box1.hashCode()); // 객체의 고유한 해쉬코드를 출력한다.
        System.out.println(box2.hashCode());

        // equals(): 두 객체가 동일한지 확인한다.
        System.out.println(box1.equals(box2)); // 같은 객체임을 알 수 있다.
        System.out.println(box1.equals(box3)); // 서로 다른 객체임을 알 수 있다.

        // toString(): 클래스의 전체 이름@hexadecimal 을 반환한다.
        System.out.println(box1.toString());
    }

}
