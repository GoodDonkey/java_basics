package com.codewithme.concurrency;

public class DownloadStatus {
    private int totalBytes;

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
        totalBytes++;
    }
}
