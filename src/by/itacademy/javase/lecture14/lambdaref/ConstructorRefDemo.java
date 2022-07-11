package by.itacademy.javase.lecture14.lambdaref;

public class ConstructorRefDemo {

    public static void main(String[] args) {
        CatBuilder builder = Cat::new;

        Cat cat = builder.create("Kitty");
        System.out.println(cat.getName());
    }
}
