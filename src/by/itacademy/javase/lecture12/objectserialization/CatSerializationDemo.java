package by.itacademy.javase.lecture12.objectserialization;

public class CatSerializationDemo {

    public static void main(String[] args) {
        Cat cat = new Cat("Kitty", new Owner("Ben"));
        CatSerializer.serialize(cat);

        System.out.println(CatDeserializer.deserialize());
    }
}
