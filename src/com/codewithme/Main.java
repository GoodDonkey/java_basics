package com.codewithme;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);

        // 통화. float라고 가정.
        System.out.print("Principal: ");
        String principalInput = scanner.next();
        float principal = Float.parseFloat(principalInput); // 나중에 통화로 바꾼다.

        // 이자율. float 가정.
        System.out.print("Annual Interest Rate: ");
        String rateInput = scanner.next();
        float rate = Float.parseFloat(rateInput);

        // float라고  가정.
        System.out.print("Period (years): ");
        String paymentsInput = scanner.next();
        float numberOfPayments = Float.parseFloat(paymentsInput);

        // calculation
        System.out.print("Monthly payment is: ");

        // float이라고 가정하고 계산한다.
        double monthlyPaymentCal = (principal * ((rate * Math.pow((1 + rate), numberOfPayments)) / (Math.pow((1 + rate), numberOfPayments) - 1)));

        // currency로 포매팅하여 출력한다.
        String monthlyPayment = currency.format(monthlyPaymentCal);
        System.out.println(monthlyPayment);




    }
}