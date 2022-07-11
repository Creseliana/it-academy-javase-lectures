package by.itacademy.javase.lecture13.deadlock;

public class A {

    synchronized void method(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " in method class A");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("Interrupted class A");
        }
        System.out.println(name + " tries call method last class B");
        b.last(name);
    }

    synchronized void last(String name) {
        System.out.println(name + " in method last class A");
    }
}
