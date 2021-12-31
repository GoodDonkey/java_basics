package com.codewithme.exceptions;

import java.io.IOException;

public class ExceptionsDemo {
    public static void show() throws IOException {
        var account = new Account();
        try {
            account.withdraw(10);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage()); // InsufficientFundsException 에 정의된 메시지를 가져와 프린트한다.
        }

    }
}
