package by.itacademy.javase.lecture15.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SyncDemo {

    static int count = 0;
//    static Lock lock = new ReentrantLock();

    static synchronized void increment() {
//        lock.lock();
        try {
            count++;
            if (count == 2) {
                throw new RuntimeException();
            }
        } finally {
//            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        IntStream.range(0, 10000)
            .forEach(value -> executor.submit(SyncDemo::increment));

        try {
            executor.shutdown();
            executor.awaitTermination(60, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.err.println("task was interrupted");
        } finally {
            if (!executor.isTerminated()) {
                System.err.println("task were canceled");
            }
            executor.shutdown();
            System.out.println("finished successfully");
        }

        System.out.println(count);
    }
}
