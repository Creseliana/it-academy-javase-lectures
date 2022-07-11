package by.itacademy.javase.lecture13.multithread;

public class Caller implements Runnable {

    private final Call call;

    private final String message;

    private final Thread thread;

    public Caller(Call call, String message) {
        this.call = call;
        this.message = message;
        this.thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {
            synchronized (call) {
                call.call(message);
            }
        } catch (InterruptedException e) {
            System.err.println("Thread was interrupted");
        }
    }

    public Thread getThread() {
        return thread;
    }
}
