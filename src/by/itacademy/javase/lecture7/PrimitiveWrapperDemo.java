package by.itacademy.javase.lecture7;

/**
 * @author Valeria Sterzhanova
 */
public class PrimitiveWrapperDemo {

    public static void main(String[] args) {
        Byte b = 100;
        Short s = 100;
        Integer i = 100;
        Long l = 100L;
        Float f = 1.1f;
        Double d = 1.1;
        Character c = 'c';
        Boolean bool = Boolean.TRUE;

        Integer integer = Integer.valueOf("1");
        int parsedInt = Integer.parseInt("1");
    }
}
