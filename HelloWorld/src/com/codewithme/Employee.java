package com.codewithme;

public class Employee {
    private int baseSalary; // private 으로 정의하고 setter, getter를 이용해 값을 넣고, 조회한다.
    private int hourlyRate; // 항상 같은 값이라고 가정.

    public static int numberOfEmployees; // static field

    // Constructor
    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary); // 값 검증을 위해 setter 사용.
        setHourlyRate(hourlyRate); // HourlyRate가 없는 경우엔 0으로 초기화하도록 한다.

        numberOfEmployees++; // 객체를 만들 때마다 1씩 더한다.
    }

    // Constructor Overloading
    public Employee(int baseSalary) {
        this(baseSalary, 0);
    }

    // static method
    public static void printNumberOfEmployees() {
        System.out.println(numberOfEmployees);

        // static method 에서는 다른 instance method에 접근할 수 없다.
        // 따라서 객체를 먼저 만들어야 사용할 수 있다.
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    public int calculateWage() {
        // method overloading: parameter 없이도 사용할 수 있도록 정의하였음.
        return calculateWage(0);
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less."); // java library에 있는 exception을 사용함.
        this.baseSalary = baseSalary;

    }

    // 굳이 밖에서 부를 일이 없는 메소드는 private으로 정의한다.
    private int getBaseSalary() {
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly Rate cannot be 0 or less.");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }
}
