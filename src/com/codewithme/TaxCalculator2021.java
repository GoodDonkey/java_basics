package com.codewithme;

public class TaxCalculator2021 implements TaxCalculator{
    private double taxableIncome;

    public TaxCalculator2021(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    // interface 에 정의된 메서드를 정의하고 있다.
    // 정확하게 하려면 오버라이드를 해주는 것이 좋다.
    @Override
    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}
