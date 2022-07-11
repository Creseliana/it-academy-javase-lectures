package by.itacademy.javase.lecture15.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> task = () -> {
            TimeUnit.SECONDS.sleep(3);
            return 1;
        };

        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future = executor.submit(task);

        System.out.println("Is task done? -" + future.isDone());

        Integer result = null;
        try {
            result = future.get(1, TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            System.err.println("interrupted");
        }

        System.out.println("Is task done? -" + future.isDone());
        System.out.println(result);
    }
}
