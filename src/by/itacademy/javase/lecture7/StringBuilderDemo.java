package by.itacademy.javase.lecture7;

/**
 * @author Valeria Sterzhanova
 */
public class StringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello World");
        System.out.println("Initial line: " + stringBuilder);

        stringBuilder.append('!').append(' ').append(123);
        System.out.println("Append: " + stringBuilder);

        stringBuilder.insert(5, '.');
        System.out.println("Insert: " + stringBuilder);

        stringBuilder.setCharAt(5, '?');
        System.out.println("Set another char at the index: " + stringBuilder);

        stringBuilder.deleteCharAt(5);
        System.out.println("Delete char at the index: " + stringBuilder);

        stringBuilder.delete(11, stringBuilder.length());
        System.out.println("Delete part of the line: " + stringBuilder);

        stringBuilder.reverse();
        System.out.println("Reversed line: " + stringBuilder);

        // https://docs.oracle.com/javase/10/docs/api/java/lang/StringBuilder.html
    }
}
