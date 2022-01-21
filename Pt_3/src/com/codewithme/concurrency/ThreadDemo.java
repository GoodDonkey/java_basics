package com.codewithme.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ThreadDemo {

    public static void show() {

        List<Thread> threads = new ArrayList<>();
        List<DownloadFileTask> tasks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            var task = new DownloadFileTask();
            tasks.add(task);

            var thread = new Thread(task);
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

        // 각 쓰레드의 결과들을 합한다.
        Optional<Integer> totalBytes = tasks.stream()
                .map(t -> t.getStatus().getTotalBytes())
                .reduce(Integer::sum);

        System.out.println(totalBytes);
    }
}
