package by.itacademy.javase.lecture13.multithread;

public class CallDemo {

    public static void main(String[] args) {
        Call call = new Call();
        Caller caller1 = new Caller(call, "first");
        Caller caller2 = new Caller(call, "second");
        Caller caller3 = new Caller(call, "third");

        try {
            caller1.getThread().join();
            caller2.getThread().join();
            caller3.getThread().join();
        } catch (InterruptedException e) {
            System.err.println("Interrupted");
        }

    }
}
