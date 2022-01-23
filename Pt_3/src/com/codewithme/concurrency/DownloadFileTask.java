package com.codewithme.concurrency;

public class DownloadFileTask implements Runnable {

    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {

        this.status = status;
    }

    @Override
    public void run() {
        String currentThread = Thread.currentThread()
                                     .getName();
        System.out.println("Downloading a file: " + currentThread);

        for (var i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted()) return;
            status.incrementTotalBytes();
        }

        status.done();
        synchronized (status) {
            status.notifyAll();
        }

        System.out.println("Download complete: " + currentThread);
    }

    public DownloadStatus getStatus() {
        return status;
    }
}
