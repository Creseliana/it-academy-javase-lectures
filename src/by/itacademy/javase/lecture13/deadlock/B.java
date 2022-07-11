package by.itacademy.javase.lecture13.deadlock;

public class B {

    synchronized void method(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " in method class B");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("Interrupted class B");
        }
        System.out.println(name + " tries call method last class A");
        a.last(name);
    }

    synchronized void last(String name) {
        System.out.println(name + " in method last class B");
    }
}
