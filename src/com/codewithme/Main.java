package com.codewithme;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);

        int principal;
        float interest;
        int period;

        float monthlyInterest;
        int numberOfPayments;

        // 통화.
        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1000000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000");
        }

        // 이자율.
        while (true) {
            System.out.print("Annual Interest Rate: ");
            interest = scanner.nextFloat();
            if (interest > 0 && interest <= 30) {
                monthlyInterest = interest / 100 / 12;
                break;
            }
            System.out.println("Enter a number between 0 and 30");
        }

        // 기간
        while (true) {
            System.out.print("Period (years): ");
            period = scanner.nextInt();
            if (period >= 1 && period <= 30) {
                numberOfPayments = period * 12;
                break;
            }
            System.out.println("Enter a number between 1 and 30");
        }

        // calculation
        System.out.print("Monthly payment is: ");
        double monthlyPaymentCal = (principal *
                ((monthlyInterest * Math.pow((1 + monthlyInterest), numberOfPayments))
                        / (Math.pow((1 + monthlyInterest), numberOfPayments) - 1)));

        // currency로 포매팅하여 출력한다.
        String monthlyPayment = currency.format(monthlyPaymentCal);
        System.out.println(monthlyPayment);
    }
}