package by.itacademy.javase.lecture9.generic;

public class GenericCatDemo {

    public static void main(String[] args) {
        GenericCat<String, Integer> cat1 = new GenericCat<>("bengal", 100);
        System.out.println(cat1);

        GenericCat<String, Double> cat2 = new GenericCat<>("pers", 55.0);
        System.out.println(cat2);
    }
}
