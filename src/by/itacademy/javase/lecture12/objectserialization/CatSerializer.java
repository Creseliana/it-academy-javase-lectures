package by.itacademy.javase.lecture12.objectserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CatSerializer {

    public static void serialize(Cat cat) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(
            new FileOutputStream("cat.bin"))) {
            outputStream.writeObject(cat);
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
