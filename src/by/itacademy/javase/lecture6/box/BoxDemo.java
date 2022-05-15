package by.itacademy.javase.lecture6.box;

public class BoxDemo {

    public static void main(String[] args) {
        Box box = new Box();
        // без private модификатора
//        box.height = 3;
//        box.width = 3;
//        box.depth = 5;
//        box.name = "Just box";
//
//        String boxName = box.name;
//        System.out.println(boxName);
//        System.out.println(box.name);
//
//        int boxVolume = box.calculateVolume();
//        box.printName();

        // инициализация объектов используя разные конструкторы
        Box defaultBox = new Box();
        Box namedBox = new Box("Boxy");
        Box sizedBox = new Box(4, 3, 3);
        Box someBox = new Box(4, 4, 4, "Some box");

        // использование статической переменной класса Box
        System.out.println(Box.counter); // даже если еще нет ни одного объекта
        Box.counter++; // counter = 1
        someBox.counter++; // counter = 2
        someBox.printCounter(); // 2
        box.printCounter(); // 2

        // использование утильного класса со статическим методом
        int calculatedVolume = VolumeCalculatorUtil.calculateBoxVolume(sizedBox);

        // использование геттеров и сеттеров
        String boxName = box.getName();
        box.setName("new name");
        System.out.println(box.getName());

        // изменение объекта при передаче его в метод
        // несколько переменных ссылаются на один объект
        Box testBox = box;
        System.out.println(box.getName());
        System.out.println(testBox.getName());
        changeBoxName(box);
        System.out.println(box.getName());
        System.out.println(testBox.getName());

        // отделение логики от сущности в другой класс
        VolumeCalculator volumeCalculator = new VolumeCalculator();
        int sizedBoxVolume = volumeCalculator.calculateBoxVolume(sizedBox);
    }

    // изменение объекта при передаче его в метод
    static void changeBoxName(Box box) {
        box.setName(box.getName() + " - modified");
    }
}
