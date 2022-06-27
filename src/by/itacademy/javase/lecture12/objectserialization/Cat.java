package by.itacademy.javase.lecture12.objectserialization;

import java.io.Serializable;

public class Cat implements Serializable {

    private static final long serialVersionUID = 2L;

    private String name;

    private Owner owner;

    public Cat(String name, Owner owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Cat{" +
            "name='" + name + '\'' +
            ", owner=" + owner.getName() +
            '}';
    }
}
