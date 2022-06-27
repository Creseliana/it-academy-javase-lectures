package by.itacademy.javase.lecture12.objectserialization;

import java.io.Serializable;

public class Owner implements Serializable {

    private static final long serialVersionUID = -4261663805679949475L;

    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
