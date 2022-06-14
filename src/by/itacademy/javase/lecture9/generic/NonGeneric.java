package by.itacademy.javase.lecture9.generic;

public class NonGeneric {

    private Object object;

    public NonGeneric(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public void printType() {
        System.out.println(this.object.getClass().getSimpleName());
    }

    public void printNumber() {
        System.out.println((int) object);
    }
}
