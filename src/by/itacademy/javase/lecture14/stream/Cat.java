package by.itacademy.javase.lecture14.stream;

import java.util.Arrays;
import java.util.List;

public class Cat implements Comparable {

    private String name;

    private List<String> toys;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, String ... toys) {
        this.name = name;
        this.toys = Arrays.asList(toys);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getToys() {
        return toys;
    }

    @Override
    public int compareTo(Object o) {
        return this.name.compareTo(((Cat) o).name);
    }

    @Override
    public String toString() {
        return "Cat{" +
            "name='" + name + '\'' +
            ", toys=" + toys +
            '}';
    }
}
