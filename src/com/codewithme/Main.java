package com.codewithme;

public class Main {

    public static void main(String[] args) {
        var employee = new Employee();

        // set
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);

        // get
        System.out.println(employee.getBaseSalary());
        System.out.println(employee.getHourlyRate());

        // 계산
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}