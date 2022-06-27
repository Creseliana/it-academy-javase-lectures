package by.itacademy.javase.lecture12.bufferedreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuffDemo {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String s = reader.readLine();
            System.out.println("echo: " + s);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
