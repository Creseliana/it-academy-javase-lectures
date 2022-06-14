package by.itacademy.javase.lecture9.generic;

public class GenericConstructor {

    private double value;

    public <T extends Number> GenericConstructor(T value) {
        this.value = value.doubleValue();
    }

    public void print() {
        System.out.println(this.value);
    }
}
