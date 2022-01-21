package com.codewithme.test;

public class TestMain {

    public static void main(String[] args) {
        var status = new Status();

        Thread thread1 = new Thread(new Task(status));
        Thread thread2 = new Thread(
                () -> {
                    while (!status.isDone()) {}
                    System.out.println("thread2: 끝난거 확인:" + status.getNumber());
                }
        );

        thread1.start(); // status 의 숫자 올리기 시작
        thread2.start(); // status 의 isDone 확인 시작
    }

}
