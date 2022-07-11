package by.itacademy.javase.lecture13.multithread;

public class RunnableThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Из цикла дочернего потока " + i);
//                Thread.sleep(500);
        }
        System.out.println("Дочерний поток завершен");
    }
}
