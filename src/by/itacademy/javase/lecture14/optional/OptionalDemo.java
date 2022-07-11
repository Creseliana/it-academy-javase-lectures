package by.itacademy.javase.lecture14.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        Cat defaultCat = new Cat("Default");
        Optional<Cat> optionalCat1 = Optional.of(new Cat("Cat1"));
        Optional<Cat> optionalCat2 = Optional.empty();
//        Optional<Cat> optionalCat3 = Optional.of(null);
        Optional<Cat> optionalCat4 = Optional.ofNullable(null);

        List<Optional<Cat>> cats = new ArrayList<>();
        cats.add(optionalCat1);
        cats.add(optionalCat2);
//        cats.add(optionalCat3);
        cats.add(optionalCat4);

        for (Optional<Cat> cat : cats) {
            Cat cat1;

            if (cat.isPresent()) {
                cat1 = cat.get();
            } else {
                cat1 = cat.orElse(new Cat("De"));
                cat1 = cat.orElseGet(() -> {
                    String name = "Temporary";
                    return new Cat(name);
                });
                cat1 = cat.orElseGet(() -> new Cat("De"));
            }
            System.out.println(cat1.getName());
        }

        optionalCat2.orElseThrow();

        optionalCat2.orElseThrow(() -> {
            String msg = "No cat in optional";
            System.out.println(msg);
            return new RuntimeException(msg);
        });
    }
}
