package com.codewithme.test;

public class Task implements Runnable {

    private Status status;

    public Task(Status status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Task: incrementing Number...");

        for (int i = 0; i < 10000; i++) {
//            System.out.println("incrementing sequence...: " + i); // 이 라인을 주석처리하면 thread2도 정상 완료됨(?)
            status.incrementNumber();
        }

        status.Done(); // 끝났으니 isDone 을 true 로 세팅.
        System.out.println("Task: increment complete!");
    }
}
