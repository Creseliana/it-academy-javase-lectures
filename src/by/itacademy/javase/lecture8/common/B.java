package by.itacademy.javase.lecture8.common;

// абстракция - вынесение общих задач
public class B extends A {

    public final String s = "In class B var";

    private int varB;

    public B() {
//        super(); // вызывается неявно
        System.out.println("In class B constructor");
    }

    public B(int varB) {
//        super(0); // если не указывать явно, то по умолчанию будет вызван без параметров, если он есть
        // если его нет, то будет ошибка компиляции
        this.varB = varB;
    }

    public B(int varA, int varB) {
        super(varA);
        this.varB = varB;
    }

    public int getVarB() {
        return varB;
    }

    public void setVarB(int varB) {
        this.varB = varB;
    }

    public void methodB() {
        System.out.println("In class B method B");
    }

    //    @Override
    public void methodA() {
        super.methodA(); // из-за сокрытия переопределением нужно явно указать super
        System.out.println("In class B method A");
    }

    public void methodA(String msg) {
        System.out.println(msg + ": In class B method A overloaded");
    }

    @Override
    protected void protMethodA() { // может быть public (расширение)
        protFinMethodA();
//        super.protFinMethodA();
        System.out.println("In class B method A protected");
    }
}
