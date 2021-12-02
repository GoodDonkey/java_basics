package com.codewithme;

public class Main {

    public static void main(String[] args) {
        var calculator = new TaxCalculator2018(100_000);
        var report = new TaxReport(calculator);
        report.show();

        // report에 다른 calculator를 setter를 사용해 주입한다.
        report.setCalculator(new TaxCalculator2019());
        report.show();

    }
}
