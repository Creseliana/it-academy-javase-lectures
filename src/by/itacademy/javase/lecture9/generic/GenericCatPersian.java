package by.itacademy.javase.lecture9.generic;

public class GenericCatPersian<I extends Number, Y> extends GenericCat<String, I> {

    public GenericCatPersian(String s, I i) {
        super(s, i);
    }
}
