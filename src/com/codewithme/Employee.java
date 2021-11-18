package com.codewithme;

public class Employee {
    public int baseSalary; // 항상 같은 값이라고 가정.
    public int hourlyRate; // 항상 같은 값이라고 가정.

    // extraHours 는 매달 달라진다고 가정.
    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
}
