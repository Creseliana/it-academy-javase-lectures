package by.itacademy.javase.lecture13.multithread;

public class Call {

    void call(String message) throws InterruptedException {
        System.out.println("[" + message);
        Thread.sleep(1000);
        System.out.println("]");
    }
}
