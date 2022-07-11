package by.itacademy.javase.lecture13.multithread;

public class Consumer implements Runnable {

    private final Queue queue;

    public Consumer(Queue queue) {
        this.queue = queue;
        new Thread(this, "consumer").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 40; i++) {
            queue.get();
        }
    }
}
