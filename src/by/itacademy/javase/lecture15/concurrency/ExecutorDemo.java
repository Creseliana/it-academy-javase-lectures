package by.itacademy.javase.lecture15.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorDemo {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            try {
                Thread.currentThread().wait(6000);
            } catch (InterruptedException e) {
                System.err.println("interrupted");
            }
            System.out.println("Current thread: " + threadName);
        });

        try {
            executor.shutdown();
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.err.println("task was interrupted");
        } finally {
            if (!executor.isTerminated()) {
                System.err.println("task were canceled");
            }
            executor.shutdown();
            System.out.println("finished successfully");
        }
    }
}
