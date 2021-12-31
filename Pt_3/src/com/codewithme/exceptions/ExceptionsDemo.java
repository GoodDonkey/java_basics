package com.codewithme.exceptions;

import java.io.IOException;

public class ExceptionsDemo {
    public static void show() throws IOException {
        var account = new Account();
        try {
            account.withdraw(10);
        } catch (AccountException e) {
            Throwable cause = e.getCause(); // cause 는 InsufficientFundsException 를 가리킨다.
            System.out.println(cause.getMessage());
            e.printStackTrace();
        }
    }
}
