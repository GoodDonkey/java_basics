package com.codewithme;

public class TaxCalculator2018
        extends AbstractTaxCalculator {
    // AbstractTaxCalculator 에서 이미 interface를 implement하고 있으므로 여기서 굳이 명시할 필요가 없다.

    private final double taxableIncome;

    public TaxCalculator2018(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    // interface 에 정의된 메서드를 정의하고 있다.
    // 정확하게 하려면 오버라이드를 해주는 것이 좋다.
    @Override
    public double calculateTax() {
        return taxableIncome * 0.3;
    }
}
