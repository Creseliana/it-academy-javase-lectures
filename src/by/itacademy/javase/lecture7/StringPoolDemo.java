package by.itacademy.javase.lecture7;

public class StringPoolDemo {

    public static void main(String[] args) {
        // В пуле строк будет строка "SomeString"
        // Так как обе переменных содержат ссылки на эту строку из пула строк,
        // то значения этих переменных (ссылки) равны
        String line1 = "SomeString";
        String line2 = "SomeString";
        System.out.println("line1 == line2 is " + (line1 == line2)); // true

        // В пуле строк будут строки "SomeString", "Some", "String"
        // Сложение строк будет выполнено на этапе компиляции и переменной
        // line4 будет присвоена ссылка на строку "SomeString"
        // поэтому эти переменные тоже будут содержать одинаковые ссылки
        String line3 = "SomeString";
        String line4 = "Some" + "String";
        System.out.println("line3 == line4 is " + (line3 == line4)); // true

        // В пуле строк будут строки "SomeString", "Some", "String"
        // Сложение строк уже будет выполнено на этапе выполнения и новый объект
        // будет помещен в кучу, а не в пул строк, поэтому line5 будет содержать ссылку
        // на строку в пуле, а line7 на строку в кучу, соответственно, они не будут равны
        String line5 = "SomeString";
        String line6 = "String";
        String line7 = "Some" + line6;
        System.out.println("line5 == line7 is " + (line5 == line7)); // false

        // line8 значение в пуле строк, а line9 и line10 создаются новые объекты и помещаются
        // в кучу, поэтому все три переменные содержат ссылки на разные области памяти
        String line8 = "SomeString";
        String line9 = new String("SomeString");
        String line10 = new String("SomeString");
        System.out.println("line8 == line9 is " + (line8 == line9)); // false
        System.out.println("line9 == line10 is " + (line9 == line10)); // false

        // объекты строки, которые храняться в куче могут быть интернированы
        String line11 = "SomeString";
        String line12 = "String";
        String line13 = new String("SomeString");
        String line14 = "Some" + line12;
        System.out.println("Before intern:");
        System.out.println("line11 == line13 is " + (line11 == line13));
        System.out.println("line13 == line14 is " + (line13 == line14));
        line13 = line13.intern();
        line14 = line14.intern();
        System.out.println("After intern:");
        System.out.println("line11 == line13 is " + (line11 == line13));
        System.out.println("line13 == line14 is " + (line13 == line14));
    }
}
