package by.itacademy.javase.lecture7;

public class StringDemo {

    public static void main(String[] args) {
        char[] array = {'s', 'o', 'm', 'e', ' ', 's', 't', 'r', 'i', 'n', 'g'};

        // способы объявления строк:

        // 1. Присвоением строки переменной (неявно все равно создается объект)
        String line1 = "This is String line";
        // 2. Явно создавая объект (используя один из существующих в классе конструкторов)
        String line2 = new String();
        String line3 = new String("This is another String line");
        String line4 = new String(array);
        String line5 = new String(array, 3, 4);
        // другие конструкторы можно посмотреть в документации


        // операции над строками:

        // 1. Операция сложения строк
        String line6 = "Some" + " " + "string\n" + line3;
        // 2. Операция сложения с присвоением
        line6 += "\nEnd";
        // в обоих случаях будет создаваться новый объект
        //3. Сравнение ссылок на объекты строк (именно ссылок, а не самих строк)
        boolean areReferencesEqual = line1 == line3;

        // любой тип данных складываемый со строкой будет автоматически приведен к строке
        int number = 6;
        String line7 = number + "";
//        String line8 = number; // ошибка компиляции, так нельзя

        // строки и приоритет операций
        String line9 = 6 + 6 + ""; // 12
        String line10 = 6 + "" + 6; // 66
        String line11 = 6 + (6 + ""); // 66
        // при сложении чисел со строками соблюдается стандартный приоритет операций
        // и менять приоритет можно расставляя скодки

        // при вызове метода вывода выражение в скобках автоматически приводится к строке
        // приведенные ниже строки кода равнозначны
        System.out.println(line9);
        System.out.println(6 + 6 + "");
    }
}
