package by.itacademy.javase.lecture14.funcint;

import java.util.function.Predicate;

public class InterfaceDemo {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Aaaa");
        Cat cat2 = new Cat("Bbbb");
        cat2.feed();
        Predicate<Cat> isCatFedPredicate = cat -> cat.isFed();
        System.out.println(isCatFedPredicate.test(cat1));
        System.out.println(isCatFedPredicate.test(cat2));
    }
}
