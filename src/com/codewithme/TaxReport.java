package com.codewithme;

// TaxCalculator 클래스를 사용하는 클래스.
public class TaxReport {
    private TaxCalculator2021 calculator;

    public TaxReport() {
        calculator = new TaxCalculator2021(100_000);
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }

}
