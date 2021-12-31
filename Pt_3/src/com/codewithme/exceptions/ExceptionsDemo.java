package com.codewithme.exceptions;

import java.util.Locale;

public class ExceptionsDemo {
    public static void show() {
        sayHello(null);
    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase(Locale.ROOT));
    }
}
