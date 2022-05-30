package by.itacademy.javase.lecture8.common;

public class A {

    public final String s = "In class A var";

    private int varA;

    public A() { // если не указан, то у всех наследников должен быть вызван явно другой существующий конструктор
        System.out.println("In class A constructor");
    }

    public A(int varA) {
        this.varA = varA;
    }

    public int getVarA() {
        return varA;
    }

    public void setVarA(int varA) {
        this.varA = varA;
    }

    public void methodA() {
        System.out.println("In class A method A");
    }

    protected void protMethodA() {
        System.out.println("In class A method A protected");
    }

    private void privMethodA() {
        System.out.println("In class A method A private");
    }

    protected final void protFinMethodA() {
        System.out.println("In class A method A protected");
    }
}
