package by.itacademy.javase.lecture7;

import java.util.Arrays;

/**
 * @author Valeria Sterzhanova
 */
public class StringMethodsDemo {

    public static void main(String[] args) {
        String line = "Hello World";
        String line1 = "Another Hello World";

        // Возвращает длину строки
        int length = line.length();
        System.out.println("\"Hello World\" line is " + length + " characters long");

        // Возвращает true, если длина строки равна 0 (пустая строка)
        boolean isEmpty = line.isEmpty();
        // Возвращает true, если строка пустая или содержит только пробельные символы
        boolean isBlank = line.isBlank();

        // Возвращает символ с указанным индексом
        char c = line.charAt(6);
        System.out.println("Character at position 6 is " + c);

        // Сравнивает содержимое двух строк
        // возвращает 0, если строки равны,
        // положительное число, если первая строка меньше,
        // отрицательное число, если первая строка больше
        // сравниваются попарно коды Unicode символов и на основании их сравнения получается результат
        int compareResult1 = line.compareTo(line1);
        System.out.println("Compare result is "
            + compareResult1); // положительное число, первая строка больше, чем вторая
        int compareResult2 = line1.compareTo(line);
        System.out.println("Compare result is "
            + compareResult2); // отрицательное число, первая строка меньше, чем вторая
        // Игнорирует регистр при сравнении
        int compareResultIgnoreCase = line.compareToIgnoreCase("HELLO WORLD");
        System.out.println("Compare result is " + compareResultIgnoreCase); // число 0, строки равны

        // Сравнивает содержимое двух строк
        // возвращает true, если строки равны, а иначе false
        boolean areLinesEqual = line.equals(line1);
        System.out.println("The line \"Hello World\" is equal to the line \"Another Hello World\": "
            + areLinesEqual);
        // Игнорирует регистр при сравнении
        boolean areLinesEqualIgnoreCase = line.equalsIgnoreCase("HELLO WORLD");
        System.out.println(
            "The line \"Hello World\" is equal ignore case to the line: \"HELLO WORLD\": "
                + areLinesEqualIgnoreCase);

        // Прибавляет к строке строку, которая передана аргументом, и возвращает новую строку.
        // Работает подобно оператору сложения
        String concatResult = line.concat("!!!");
        System.out.println("Concatenation result: " + concatResult);

        // Проверяет, начинается ли строка на переданную аргументом строку
        boolean startsWith = line.startsWith("He");
        System.out.println("Line \"Hello World\" starts with \"He\": " + startsWith);

        // Проверяет, оканчивается ли строка на переданную аргументом строку
        boolean endsWith = line1.endsWith(line);
        System.out.println("Line \"Another Hello World\" ends with \"Hello World\": " + endsWith);

        // Возвращает строку в виде массива байт (использует кодировку платформы по умолчанию)
        // Есть варианты перегрузки с указанием кодировки
        byte[] lineBytes = line.getBytes();
        System.out.println("The line \"Hello World\" as byte array: " + Arrays.toString(lineBytes));

        // Возвращает индекс первого символа, который передан как аргумент
        int indexOf = line.indexOf('l');
        // Возвращает индекс последнего символа, который передан как аргумент
        int lastIndexOf = line.lastIndexOf('l');
        System.out.println("First index of character 'l' is " + indexOf); // 2
        System.out.println("Last index of character 'l' is " + lastIndexOf); // 9

        // Заменяет в строке все символы соответствующие первому аргументы на символы второго аргумента
        // и возвращает новую строку
        String line3 = line1.replace('o', '0');
        System.out.println("Replace letter 'o' with 0: " + line3);

        // Возвращает строку в виде массива символов
        char[] lineChars = line.toCharArray();
        System.out.println("The line \"Hello World\" as char array: " + Arrays.toString(lineChars));

        // Возвращает новую строку со всеми символами в верхнем регистре
        String upperCaseLine = line.toUpperCase();
        System.out.println("The line \"Hello World\" in upper case: " + upperCaseLine);

        // Возвращает новую строку со всеми символами в нижнем регистре
        String lowerCaseLine = line.toLowerCase();
        System.out.println("The line \"Hello World\" in lower case: " + lowerCaseLine);

        // Возвращает подстроку из строки по переданным индексам
        String substring = line.substring(3, 8);
        System.out.println("Substring from index 3 to 8: " + substring);

        // Возвращает новую строку, которая состоит из сложений указанной строки переданное количество раз
        String repeatedLine = line.repeat(3);
        System.out.println("The line \"Hello World\" repeated 3 times: " + repeatedLine);

        // Возвращает строковое представление некоторых типов данных
        // есть варианты перегрузки для массивов символов и некоторых примитивных типов
        String valueOfInt = String.valueOf(1);
        String valueOfDouble = String.valueOf(1.0);

        // Варианты перегрузок указанных методов и другие существующие методы и конструкторы
        // класса String можно посмотреть в документации:
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
    }
}
