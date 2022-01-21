package com.codewithme.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {

    public static void show() {
        var status = new DownloadStatus();

        var thread1 = new Thread(new DownloadFileTask(status));
        var thread2 = new Thread(() -> {

            // isDone 이 true 가 될떄까지 기다린다.
            while (!status.isDone()) {
//                System.out.println(); // 프린트하면 어쨋든 메모리에 접근해서 status 값을 업데이트한다???
            }

            // status 의 결과를 찍는다.
            System.out.println(status.getTotalBytes());
        });

        thread1.start(); // 끝나면 isDone 이 true가 된다.
        thread2.start(); // status 가 true가 되면 끝나야하는데 끝나지 않는다.
    }
}
