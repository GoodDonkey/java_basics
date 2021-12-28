package com.codewithme;

import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currency; // field를 다시 선언할 필요가 없으므로 final로 선언해도 좋다.
    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");

        // array를 반환하는 getRemainingBalances() 에서 하나씩 값을 뽑아 print한다.
        for (double balance : calculator.getRemainingBalances())
            System.out.println(currency.format(balance));
    }

    public void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String mortgageFormatted = currency.format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
}
