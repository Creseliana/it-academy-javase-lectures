package by.itacademy.javase.lecture7;

/**
 * @author Valeria Sterzhanova
 */
public class StringFormatDemo {

    public static void main(String[] args) {
        // Общий синтаксис форматирования:
        // %[argument_index$][flags][width][.precision]conversion

        // %s - вставка строки или любого другого значения с приведением к строке. Символы в нижнем регистре
        // %n - вставка перехода на новую строку
        // %S - вставка строки или любого другого значения с приведением к строке. Символы в верхнем регистре
        // %c - вставка символа
        System.out.printf("This %s is about %n%S %c", "book", "java", '8');
        System.out.println();
        // %f - вставка числа с плавающей точкой
        // .2 - ограничение числа с плавающей точкой двумя знаками после точки
        String formattedString = String.format("Число ПИ равно - %.2f", 3.14159);
        System.out.println(formattedString);

        // Документация по форматированию строк:
        // https://docs.oracle.com/javase/10/docs/api/java/util/Formatter.html
    }
}
