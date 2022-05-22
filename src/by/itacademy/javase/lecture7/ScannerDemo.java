package by.itacademy.javase.lecture7;

import java.util.Scanner;

/**
 * @author Valeria Sterzhanova
 */
public class ScannerDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;

        System.out.println("Введите ваше имя: ");
        System.out.println("Привет, " + scanner.nextLine());

        do {
            printMenu();
            input = Integer.parseInt(scanner.nextLine());
            handleInput(input);
        } while (input != 3);

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("1. Сложение");
        System.out.println("2. Умножение");
        System.out.println("3. Выход");
    }

    private static void handleInput(int input) {
        switch (input) {
            case 1:
                System.out.println("Складываем");
                // ... some code
                break;
            case 2:
                System.out.println("Умножаем");
                // ... some code
                break;
            case 3:
                break;
            default:
                System.out.println("Неверный ввод...");
        }
    }
}
