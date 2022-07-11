package by.itacademy.javase.lecture13.multithread;

public class InheritThread extends Thread {

    public InheritThread(String name) {
        super(name);
        System.out.println("Дочерний поток: " + this);
//        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Из цикла дочернего потока " + this.getName() + " " + i);
//                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println("Поток был прерван");
        }
        System.out.println("Дочерний поток завершен");
    }
}
