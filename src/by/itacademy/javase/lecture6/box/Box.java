package by.itacademy.javase.lecture6.box;

class Box {

    static int counter = 0;

    // без модификатора private
//    int height;
//    int width;
//    int depth;
//    String name;

    private int height;
    private int width;
    private int depth;
    private String name;

    // объект с вложенными объектами
    private Box parentBox;
    private Box childBox;
    private Box[] boxes;

    // реализация конструктора по умолчанию (без параметров)
    // так как конструктор перегружен, необходимо указать его явно
    public Box() {
        // ...
    }

    // аргументы конструктора с отличающимися именами и без this
//    public Box(int h, int w, int d, String n) {
//        height = h;
//        width = w;
//        depth = d;
//        name = n;
//    }

    // аргументы конструктора с отличающимися именами и с this
//    public Box(int h, int w, int d, String n) {
//        this.height = h;
//        this.width = w;
//        this.depth = d;
//        this.name = n;
//    }

    // аргумент конструктора с именем как у поля и с this
    public Box(String name) {
        this.name = name;
    }

    public Box(int size) {
        this.height = size;
        this.width = size;
        this.depth = size;
    }

    public Box(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public Box(Box box) {
        this.height = box.height;
        this.width = box.width;
        this.depth = box.depth;
        this.name = "cloned box";
    }

    // вызов другого конструктора в конструкторе используя this
    public Box(int height, int width, int depth, String name) {
        this(height, width, depth); // может быть только первой строкой
//        this(); ошибка компиляции, может быть только один вызов конструктора через this
        this.name = name;
        this.calculateVolume();
        calculateVolume();
    }

    int calculateVolume() {
        return this.height * this.width * this.depth;
    }

    void printName() {
        System.out.println(this.name);
    }

    // использование this для получения текущего объекта
    Box cloneBox() {
        Box box = this; // this - это и есть текущий объект
        return new Box(box);
    }

    void printCounter() {
        System.out.println(counter);
        System.out.println(this.counter); // можно получить статическую переменную по текщему объекту
        // но так делать не принято
    }

    // геттеры и сеттеры для полей класса
    // в них можно добавлять дополнительную логику (проверки, например)
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (!isCorrectSideSize(height)) {
            System.out.println("Height must be positive number!!!");
            height = 0;
        }
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (!isCorrectSideSize(width)) {
            System.out.println("Width must be positive number!!!");
            width = 0;
        }
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        if (isCorrectSideSize(depth)) {
            System.out.println("Depth must be positive number!!!");
            depth = 0;
        }
        this.depth = depth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            name = "Default name";
        }
        this.name = name;
    }

    // приватные методы, как правило, вспомогательные
    private boolean isCorrectSideSize(int sideSize) {
        return sideSize > 0;
    }
}