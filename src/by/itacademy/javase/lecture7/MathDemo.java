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
        System.out.println("sin " + n + " = " + Math.sin(n));
        System.out.println("cos " + n + " = " + Math.cos(n));
        System.out.println("tan " + n + " = " + Math.tan(n));
        System.out.println("asin " + n + " = " + Math.asin(n));
        System.out.println("acos " + n + " = " + Math.acos(n));
        System.out.println("atan " + n + " = " + Math.atan(n));

        double rad = 1;
        double degree = 180;
        double r1, r2;
        r1 = Math.toDegrees(rad);
        r2 = Math.toRadians(degree);

        System.out.println(rad + " радиан = " + r1 + " градусов ");
        System.out.println(degree + " градусов = " + r2 + " радиан ");

        System.out.println("Минимальное число: " + Math.min(3, 6));
        System.out.println("Максимальное число: " + Math.max(3, 6));

        System.out.println("Модуль числа  " + 5 + " = " + Math.abs(5));
        System.out.println("Модуль числа " + -5 + " = " + Math.abs(-5));

        System.out.println("Число ПИ: " + Math.PI);

        System.out.print("Гипотенуза = " + Math.hypot(3, 4));
    }
}
