package by.itacademy.javase.lecture9.generic;

public class GenericTwo<T extends String, V extends Number> {

    private T t;
    private V v;

    public GenericTwo(T t, V v) {
        this.t = t;
        this.v = v;
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

    public void printType(T t) {
        System.out.println(t.getClass().getSimpleName());
    }

    public void printType(V v) {
        System.out.println(v.getClass().getSimpleName());
    }
}
