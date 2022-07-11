package by.itacademy.javase.lecture14.funcint;

public class Cat {

    private String name;

    private boolean isFed;

    public Cat(String name) {
        this.name = name;
        isFed = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFed() {
        return isFed;
    }

    public void setFed(boolean fed) {
        isFed = fed;
    }

    public void feed() {
        isFed = true;
    }
}
