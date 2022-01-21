package com.codewithme.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {

    public static void show() {
        var status = new DownloadStatus();

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            var thread = new Thread(new DownloadFileTask(status)); // 모든 쓰레드가 status 를 공유한다.
            thread.start();
            threads.add(thread);
        }

        // 모든 다운로드가 끝날 때까지 기다린다.
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(status.getTotalBytes());
    }
}
