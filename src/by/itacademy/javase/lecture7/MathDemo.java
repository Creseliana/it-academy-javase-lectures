package by.itacademy.javase.lecture7;

/**
 * @author Valeria Sterzhanova
 */
public class MathDemo {

    public static void main(String[] args) {
        int i1 = 4;
        double d1 = Math.sqrt(i1);
        System.out.println("Корень квадратный " + i1 + " = " + d1);

        int i2 = 8;
        double d2 = Math.cbrt(i2);
        System.out.println("Кубический корень " + i2 + " = " + d2);

        double a = 1.4;
        double round, ceil, floor;
        round = Math.round(a);
        System.out.println("Округление " + a + " = " + round);
        ceil = Math.ceil(a);
        System.out.println("Округление вверх " + a + " = " + ceil);
        floor = Math.floor(a);
        System.out.println("Округление вниз " + a + " = " + floor);

        double n = 0.5;
        double sin, cos, tan, asin, acos, atan;
        sin = Math.sin(n);
        cos = Math.cos(n);
        tan = Math.tan(n);
        asin = Math.asin(n);
        acos = Math.acos(n);
        atan = Math.atan(n);
        System.out.println("sin " + n + " = " + sin);
        System.out.println("cos " + n + " = " + cos);
        System.out.println("tan " + n + " = " + tan);
        System.out.println("asin " + n + " = " + asin);
        System.out.println("acos " + n + " = " + acos);
        System.out.println("atan " + n + " = " + atan);
    }
}
