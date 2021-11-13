package com.codewithme;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        // ", ;, ,, 등을 출력하려면 \ 를 사용.
        String message = "Hello \"World\"";
        System.out.println(message);

        // c:\Windows\...
        String message2 = "c:\\windows\\...";
        System.out.println(message2);

        // \t, \n ...
        String message3 = "c:\twindows\n...";
        System.out.println(message3);


    }
}