package by.itacademy.javase.lecture12.textfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileDemo {

    public static void main(String[] args) {
        File file = new File("text\\text-file.txt");
        write(file, "Another Hello world");

        read(file);
    }

    private static void write(File file, String text) {
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write(text);
            writer.append('\n');
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private static void read(File file) {
        StringBuilder builder = new StringBuilder();
        try (FileReader reader = new FileReader(file)) {
            int c;
            while ((c = reader.read()) != -1) {
                builder.append((char) c);
            }
            System.out.println(builder);
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
