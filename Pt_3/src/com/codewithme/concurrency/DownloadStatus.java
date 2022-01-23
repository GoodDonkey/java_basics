package com.codewithme.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

public class DownloadStatus {
    private volatile boolean isDone;
    private LongAdder totalBytes = new LongAdder(); // LongAdder, DoubleAdder...
    private int totalFiles;


    public int getTotalBytes() {
        return totalBytes.intValue(); // 쓰레드별 cell 값들을 sum() 하여 반환한다.
    }

    public void incrementTotalBytes() {
        totalBytes.increment();
    }

    public synchronized void incrementTotalFiles() {
        totalFiles++;
    }

    public int getTotalFiles() {
        return totalFiles;
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
        System.out.println("task done:  -> " + this.hashCode());
    }
}
