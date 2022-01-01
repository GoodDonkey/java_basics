package com.codewithme.lambda;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class LambdasDemo {

    public static void show() {
        Supplier<Double> getRandom = () -> Math.random(); // 이 메서드는 call 하기 전까지 실행되지 않는다.
        var random = getRandom.get(); // Double
        var random2 = Math.random(); // double
        System.out.println(random);
        System.out.println(Math.random());

        // IntSupplier 사용해보기
        String string = "Hello";
        Integer length = string.length(); // Integer로 정의하였다.
        System.out.println(length.getClass());

        IntSupplier lengthInt = () -> length;
        System.out.println(lengthInt.getAsInt()); // int 값이다. getClass()를 사용할 수 없다.
    }
}
