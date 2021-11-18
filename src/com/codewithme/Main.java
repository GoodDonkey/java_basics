package com.codewithme;

public class Main {

    public static void main(String[] args) {
        var employee = new Employee(50_000, 20); // constructor method 라고 볼 수 있다.
        int wage = employee.calculateWage();
        System.out.println(wage);
    }
}