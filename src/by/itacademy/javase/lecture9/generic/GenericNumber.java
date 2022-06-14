package by.itacademy.javase.lecture9.generic;

public class GenericNumber<N extends Number> {

    private N[] numbers;

    public GenericNumber(N[] numbers) {
        this.numbers = numbers;
    }

    public double calculateAverage() {
        double sum = 0;
        for (N number : numbers) {
            sum += number.doubleValue();
        }
        return sum / numbers.length;
    }

    public boolean compareAverage(GenericNumber<?> genericNumber) {
        if (this.calculateAverage() == genericNumber.calculateAverage()) {
            return true;
        }
        return false;
    }

    // ? - PECS
    // producer
    // extends
    // consumer
    // super
}
