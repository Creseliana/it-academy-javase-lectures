package by.itacademy.javase.lecture9.generic;

public class GenericDemo {

    public static void main(String[] args) {
        Generic<String> genericString = new Generic<>("String");
        Generic<Integer> genericInteger = new Generic<>(100);

        Generic raw = new Generic(12.03);

        String t = genericString.getT();
        Integer t1 = genericInteger.getT();
        Object t2 = raw.getT();

        double t3 = (double) raw.getT();
        System.out.println(t3);

        int t4 = (int) raw.getT();
        System.out.println(t4);
    }
}
