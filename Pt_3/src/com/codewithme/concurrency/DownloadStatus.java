package com.codewithme.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class DownloadStatus {
    private volatile boolean isDone;
    private AtomicInteger totalBytes = new AtomicInteger();
    private int totalFiles;


    public int getTotalBytes() {
        return totalBytes.get();
    }

    public void incrementTotalBytes() {
        totalBytes.incrementAndGet(); // ++a 와 같지만 증가만 목적이므로 뭐든 괜찮.
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
