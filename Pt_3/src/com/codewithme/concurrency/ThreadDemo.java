package com.codewithme.concurrency;

public class ThreadDemo {

    public static void show() {
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt(); // 직접 쓰레드를 멈출 수는 없다.


    }
}
