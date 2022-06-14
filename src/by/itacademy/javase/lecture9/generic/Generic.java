package by.itacademy.javase.lecture9.generic;

public class Generic<T> {

    private T t;

    public Generic(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void printType() {
        System.out.println(t.getClass().getSimpleName());
    }
}
