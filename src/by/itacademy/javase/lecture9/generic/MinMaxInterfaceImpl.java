package by.itacademy.javase.lecture9.generic;

public class MinMaxInterfaceImpl<C extends Comparable<C>> implements MinMaxInterface<C> {

    private C[] array;

    public MinMaxInterfaceImpl(C[] array) {
        this.array = array;
    }

    @Override
    public C min() {
        C var = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(var) < 0){
                var = array[i];
            }
        }
        return var;
    }

    @Override
    public C max() {
        C var = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(var) > 0){
                var = array[i];
            }
        }
        return var;
    }
}
