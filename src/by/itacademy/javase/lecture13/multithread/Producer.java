package by.itacademy.javase.lecture13.multithread;

public class Producer implements Runnable {

    private final Queue queue;

    public Producer(Queue queue) {
        this.queue = queue;
        new Thread(this, "producer").start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            queue.put(i);
        }
    }

    // p = 1
    // p = 2
    // p = 3
    // c = 3
    // c = 3
    // p = 4
    // c = 4
    // c = 4
    //

}
