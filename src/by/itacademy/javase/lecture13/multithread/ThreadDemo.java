package by.itacademy.javase.lecture13.multithread;

public class ThreadDemo {

    public static void main(String[] args) {
        new InheritThread("thread-1").start();
        new InheritThread("thread-2").start();
        new InheritThread("thread-3").start();

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Из цикла главного потока " + i);
//                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("Поток был прерван");
        }
        System.out.println("Главный поток завершен");
    }
}
