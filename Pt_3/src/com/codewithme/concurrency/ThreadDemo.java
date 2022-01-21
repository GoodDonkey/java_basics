package com.codewithme.concurrency;

public class ThreadDemo {

    public static void show() {
        System.out.println(Thread.currentThread().getName()); // main Thread 이다.

        for (var i = 0; i < 15; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }
    }
}
