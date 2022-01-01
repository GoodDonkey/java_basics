package com.codewithme.collections;

public class Customer implements Comparable<Customer>{
    private String name;

    public Customer(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Customer other) {
        // this < other -> -1 or negative value
        // this == other -> 0
        // this > other -> 1 or positive value
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
