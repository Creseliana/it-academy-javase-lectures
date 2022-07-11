package by.itacademy.javase.lecture14.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        Collections.addAll(nameList, "Kitt", "Tom", "Lucky");

        nameList.stream()
            .filter(name -> name.length() > 3)
            .forEach(System.out::println);

        System.out.println(nameList.size());

        Stream.of("Kitty", "Tom", "Lucky")
            .forEach(s -> {
                System.out.print(s + ": ");
                System.out.println(s.length());
            });
        List<Cat> catList = new ArrayList<>();
        Collections.addAll(catList, new Cat("Kitty"), new Cat("Tom"),
            new Cat("Lucky"));

        List<String> catNameList = catList.stream()
            .map(Cat::getName)
            .collect(Collectors.toList());

        Cat cat1 = new Cat("Cat1", "Toy11", "Toy12");
        Cat cat2 = new Cat("Cat2", "Toy21", "Toy22");
        Cat cat3 = new Cat("Cat3", "Toy31", "Toy32");
        List<Cat> catsWithToys = new ArrayList<>();
        Collections.addAll(catsWithToys, cat1, cat2, cat3);

        Object[] objects = catsWithToys.stream()
            .flatMap(cat -> cat.getToys().stream())
            .toArray();

        System.out.println(Arrays.toString(objects));

        nameList.stream()
            .sorted()
            .forEach(System.out::println);

        nameList.stream()
            .sorted((o1, o2) -> {
                if (o1.charAt(o1.length() - 1) < o2.charAt(o2.length() - 1)) {
                    return -1;
                }
                return 1;
            })
            .forEach(System.out::println);

        catList.stream()
            .sorted(Comparator.comparing(Cat::getName))
            .forEach(System.out::println);

        
        catList.stream()
            .sorted()
            .forEach(System.out::println);

        catList.add(new Cat("Tom"));

        Cat cat = catList.stream()
            .filter(cat4 -> cat4.getName().equals("Tom"))
            .findFirst().orElseThrow();
        System.out.println(cat.getName() + " : " + cat.hashCode());

        Cat cat11 = catList.stream()
            .filter(cat4 -> cat4.getName().equals("Tom"))
            .findAny().orElseThrow();
        System.out.println(cat11.getName() + " : " + cat11.hashCode());

        Stream<Cat> stream = catList.stream();
        Stream<Cat> tom = stream.filter(cat4 -> cat4.getName().equals("Tom"));
        List<Cat> collect = tom.collect(Collectors.toList());

        long tom1 = catList.stream()
            .filter(cat4 -> cat4.getName().equals("Tom"))
            .count();

        String s = cat.getToys().get(0).toUpperCase();
    }
}
