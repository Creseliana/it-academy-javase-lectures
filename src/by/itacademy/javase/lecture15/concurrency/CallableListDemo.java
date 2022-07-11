package by.itacademy.javase.lecture15.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableListDemo {

    public static void main(String[] args) {
        List<Callable<String>> callableList = Arrays.asList(
            () -> "task-1",
            () -> "task-2",
            () -> "task-3"
        );

        ExecutorService executor = Executors.newFixedThreadPool(2);

        try {
            executor.invokeAll(callableList).stream()
                .map(future -> {
                    try {
                        return future.get();
                    } catch (ExecutionException | InterruptedException e) {
                        System.err.println("exception");
                        throw new RuntimeException();
                    }
                })
                .forEach(System.out::println);
        } catch (InterruptedException e) {
            System.err.println("interrupted");
        }
    }
}
