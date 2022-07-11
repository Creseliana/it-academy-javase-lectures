package by.itacademy.javase.lecture13.multithread;

public class RunnableDemo {

    public static void main(String[] args) {
//        RunnableThread runnableThread = new RunnableThread();
//        Thread thread = new Thread(runnableThread, "thread-1");
//        thread.start();
//
//        new Thread(runnableThread, "thread-2").start();
//        new Thread(runnableThread, "thread-3").start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Из цикла главного потока " + i * i);
//                Thread.sleep(500);
        }
        System.out.println("Главный поток завершен");

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Из цикла дочернего потока " + i);
//                Thread.sleep(500);
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Из цикла дочернего потока " + (char) i);
//                Thread.sleep(500);
            }
        }).start();
    }
}
