package by.itacademy.javase.lecture13.multithread;

public class Queue {

    private int value;
    private boolean valueSet = false;

    public synchronized int get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println("Thread was interrupted");
            }
        }
        System.out.println("Get value: " + value);
        valueSet = false;
        notify();
        return value;
    }

    public synchronized void put(int value) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.err.println("Thread was interrupted");
            }
        }
        this.value = value;
        valueSet = true;
        System.out.println("Put value: " + value);
        notify();
    }
}
