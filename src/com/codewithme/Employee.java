package com.codewithme;

public class Employee {
    private int baseSalary; // private 으로 정의하고 setter, getter를 이용해 값을 넣고, 조회한다.
    private int hourlyRate; // 항상 같은 값이라고 가정.

    // extraHours 는 매달 달라진다고 가정.
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less."); // java library에 있는 exception을 사용함.
        this.baseSalary = baseSalary;

    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly Rate cannot be 0 or less.");
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }
}
