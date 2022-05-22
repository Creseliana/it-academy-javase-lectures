package by.itacademy.javase.lecture7;

/**
 * @author Valeria Sterzhanova
 */
public class IntegerCacheDemo {

    public static void main(String[] args) {
        Integer i1 = 5; // значение из кэша
        Integer i2 = 5; // значение из кэша
        Integer i3 = Integer.valueOf("5"); // значение из кэша
        Integer i4 = Integer.valueOf(5); // значение из кэша
        Integer i5 = new Integer(5); // создан новый объект и он из кучи

        System.out.println(i1 == i2); // true
        System.out.println(i1 == i3); // true
        System.out.println(i1 == i4); // true
        System.out.println(i3 == i4); // true
        System.out.println(i1 == i5); // false
        System.out.println(i3 == i5); // false

        Integer i6 = 128; // больше 127 не кэшируются
        Integer i7 = 128;
        System.out.println(i6 == i7); // false

        // * Эти правила действуют для всех целочисленных типов
    }
}
