package by.itacademy.javase.lecture8.common;

public class Main {

    public static void main(String[] args) {
        A a = new A();
        A a1 = new B();
        B b = new B();

        a.methodA();
        a.protMethodA();
        b.methodB();
        b.methodA();
        b.methodA("New ");
        b.protMethodA();
//        b.privMethodA(); // not available

        System.out.println(a.s);
        System.out.println(a1.s);

        A cl1 = new A();
        A cl2 = new B();
        A cl3 = new C();
        cl1.methodA();
        cl2.methodA();
        cl3.methodA();

    }
}
