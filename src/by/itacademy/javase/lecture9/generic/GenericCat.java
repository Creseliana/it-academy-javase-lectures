package by.itacademy.javase.lecture9.generic;

public class GenericCat<S extends String, I extends Number> {

    private S s;
    private I i;

    public GenericCat(S s, I i) {
        this.s = s;
        this.i = i;
    }

    @Override
    public String toString() {
        return "GenericCat{" +
            "breed=" + s +
            ", portion=" + i +
            '}';
    }
}
