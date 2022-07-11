package by.itacademy.javase.lecture14.lambdaref;

public class MethodRefDemo {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, -1, -2, -5};

        calculateSum(numbers, MethodRefDemo::isPositive);
        calculateSum(numbers, MethodRefDemo::isNegative);
    }

    private static boolean isPositive(int number) {
        return number > 0;
    }

    private static boolean isNegative(int number) {
        return number < 0;
    }

    private static void calculateSum(int[] number, Expression expression) {
        int result = 0;

        for (int i : number) {
            if (expression.apply(i)) {
                result += i;
            }
        }

        System.out.println("Sum is: " + result);
    }
}
