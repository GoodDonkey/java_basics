package com.codewithme.test;

public class Status {

    private boolean isDone;
    private int number;

    public void incrementNumber() {
        synchronized (this) {
            number++;
        }
    }

    public boolean isDone() {
        return isDone;
    }

    public void Done() {
        isDone = true;
    }

    public int getNumber() {
        return number;
    }
}
