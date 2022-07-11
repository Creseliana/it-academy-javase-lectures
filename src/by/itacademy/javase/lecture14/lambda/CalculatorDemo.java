package by.itacademy.javase.lecture14.lambda;

public class CalculatorDemo {

    public static void main(String[] args) {
        Calculator sum = (x, y) -> x + y;

        Calculator mult = (x, y) -> x * y;

        System.out.println(sum.calculate(3, 3));
        System.out.println(mult.calculate(3, 3));

        Calculator sum1 = new Calculator() {
            @Override
            public double calculate(double x, double y) {
                return x + y;
            }
        };

        Calculator mult1 = new Calculator() {
            @Override
            public double calculate(double x, double y) {
                return x * y;
            }
        };

        System.out.println(sum1.calculate(4, 4));
        System.out.println(mult1.calculate(4, 4));

        Calculator sum2 = new SumCalculator();
        System.out.println(sum2.calculate(5, 5));

        Calculator div = (x, y) -> {
            if (y == 0) {
                System.out.println("На ноль делить нельзя!!!");
                return 0;
            }
            return x / y;
        };
    }
}
