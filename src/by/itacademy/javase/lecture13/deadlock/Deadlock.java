package by.itacademy.javase.lecture13.deadlock;

public class Deadlock implements Runnable {

    A a = new A();
    B b = new B();

    public Deadlock() {
        Thread.currentThread().setName("main-thread");
        Thread thread = new Thread(this, "child-thread");
        thread.start();

        a.method(b);
    }

    @Override
    public void run() {
        b.method(a);
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
