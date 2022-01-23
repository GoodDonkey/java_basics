package com.codewithme.concurrency;

public class ThreadDemo {

    public static void show() {
        var status = new DownloadStatus();

        var thread1 = new Thread(new DownloadFileTask(status));
        var thread2 = new Thread(() -> {

            // isDone 이 true 가 될떄까지 기다린다.
            while (!status.isDone()) {
                synchronized (status) {
                    try {
                        status.wait(); // 다른 쓰레드가 깨울 때까지(notify) sleep(while문을 돌지 않음)
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            // status 의 결과를 찍는다.
            System.out.println(status.getTotalBytes());
        });

        thread1.start(); // 끝나면 isDone 이 true가 된다.
        thread2.start(); // status 가 true가 되면 끝나야하는데 끝나지 않는다.
    }
}
