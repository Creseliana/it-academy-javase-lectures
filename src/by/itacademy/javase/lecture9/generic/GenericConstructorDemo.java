package by.itacademy.javase.lecture9.generic;

public class GenericConstructorDemo {

    public static void main(String[] args) {
        short s = 85;
        GenericConstructor c1 = new GenericConstructor(10);
        c1.print();
        GenericConstructor c2 = new GenericConstructor(10.01);
        c2.print();
        GenericConstructor c3 = new GenericConstructor(s);
        c3.print();
    }
}
