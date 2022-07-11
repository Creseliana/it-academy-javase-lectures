package by.itacademy.javase.lecture14.lambda;

public class PrinterDemo {

    public static void main(String[] args) {

        Printer printer = s -> {
            String result = "echo: ".concat(s);
            System.out.println(result);
        };

        printer.print("hello");
    }
}
