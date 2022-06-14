package by.itacademy.javase.lecture9.generic;

public interface MinMaxInterface<C extends Comparable<C>> {

    C min();

    C max();
}
