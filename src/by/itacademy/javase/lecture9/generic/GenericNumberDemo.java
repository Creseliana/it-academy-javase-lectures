package by.itacademy.javase.lecture9.generic;

public class GenericNumberDemo {

    public static void main(String[] args) {
//        Integer[] intArray = {1, 2, 3, 4, 5};
        GenericNumber<Integer> n1 = new GenericNumber<>(new Integer[]{1, 2, 3, 4, 5});
        GenericNumber<Integer> n11 = new GenericNumber<>(new Integer[]{1, 2, 3, 4, 5});
        GenericNumber<Double> n2 = new GenericNumber<>(new Double[]{1.1, 2.2, 3.3, 4.4, 5.5});
        GenericNumber<Double> n22 = new GenericNumber<>(new Double[]{1.1, 2.2, 3.3, 4.4, 5.5});
        System.out.println(n1.calculateAverage());
        System.out.println(n2.calculateAverage());

        System.out.println(n1.compareAverage(n11));
        System.out.println(n1.compareAverage(n2));
    }
}
