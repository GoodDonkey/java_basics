package com.codewithme.exceptions;

// Checked -> Exception
// Unchecked (runtime) -> RuntimeException

public class InsufficientFundsException extends  Exception{
    public  InsufficientFundsException() { // 메시지를 따로 주지 않으면 이 메시지를 가진다.
        super("Insufficient funds in your account."); // Exception(String message)에 정의 된 데에 넣게 된다.
    }

    public InsufficientFundsException(String message) { // custom message를 call 할때 넣을 수 있도록 정의한다.
        super(message);
    }

}
