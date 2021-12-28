package com.codewithme;

public class Main {

    public static void main(String[] args) {
        var calculator = new TaxCalculator2018(100_000);
        var report = new TaxReport();
        report.show(calculator);
        // 메서드에 직접 클래스를 주입한다.
        report.show(new TaxCalculator2019());
    }
}
