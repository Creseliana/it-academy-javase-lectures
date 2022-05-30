package by.itacademy.javase.lecture8.common;

public class C extends B {

    private int varC;

    public int getVarC() {
        return varC;
    }

    public C() {
        System.out.println("In class C constructor");
    }

    public void setVarC(int varC) {
        this.varC = varC;
    }

    public void methodC() {
        System.out.println("In class C method C");
    }

    @Override
    public void methodA() {
        System.out.println("In class C method A");
    }
}
