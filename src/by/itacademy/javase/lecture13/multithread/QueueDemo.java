package by.itacademy.javase.lecture13.multithread;

public class QueueDemo {

    public static void main(String[] args) {
        Queue queue = new Queue();
        new Producer(queue);
        new Consumer(queue);
    }
}
