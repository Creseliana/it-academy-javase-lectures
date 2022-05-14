package by.itacademy.javase.lecture6;

public class BoxDemo {

    public static void main(String[] args) {
        Box box = new Box();
        box.height = 3;
        box.width = 3;
        box.depth = 5;
        box.name = "Just box";

        String boxName = box.name;
        System.out.println(boxName);
        System.out.println(box.name);

        int boxVolume = box.calculateVolume();
        box.printName();

        Box defaultBox = new Box();
        Box namedBox = new Box("Boxy");
        Box sizedBox = new Box(4, 4, 4);

        Box someBox = new Box(4, 4, 4, "Some box");
    }
}
