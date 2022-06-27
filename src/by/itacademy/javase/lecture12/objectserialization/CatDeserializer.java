package by.itacademy.javase.lecture12.objectserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CatDeserializer {

    public static Cat deserialize() {
        try (ObjectInputStream inputStream = new ObjectInputStream(
            new FileInputStream("cat.bin"))) {
            return (Cat) inputStream.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
