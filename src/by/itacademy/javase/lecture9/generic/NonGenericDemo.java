package by.itacademy.javase.lecture9.generic;

public class NonGenericDemo {

    public static void main(String[] args) {

        NonGeneric n1 = new NonGeneric(100);
        NonGeneric n2 = new NonGeneric("This is string");
        n1.printType();
        n2.printType();
        n1.printNumber();
        n2.printNumber();
        n1 = n2;
    }
}
