package com.codewithme.concurrency;

public class ThreadDemo {

    public static void show() {
        System.out.println(Thread.currentThread().getName()); // main Thread 이다.

        Thread thread = new Thread(new DownloadFileTask());
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("File is ready to be scanned");

    }
}
