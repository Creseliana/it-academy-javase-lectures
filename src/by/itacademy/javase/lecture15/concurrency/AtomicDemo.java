package by.itacademy.javase.lecture15.concurrency;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class AtomicDemo {

    public static void main(String[] args) {
        LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
//        i++;
        AtomicInteger number = new AtomicInteger(0);

        ExecutorService executor = Executors.newFixedThreadPool(3);

        IntStream.range(0, 10000)
            .forEach(value -> executor.submit(number::incrementAndGet));

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

        System.out.println(number.get());
    }
}
