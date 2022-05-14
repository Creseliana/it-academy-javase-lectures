package by.itacademy.javase.lecture6;

class Box {

    static int counter = 0;

    int height;
    int width;
    int depth;
    String name;

    public Box() {
        // ...
    }

//    public Box(int h, int w, int d, String n) {
//        height = h;
//        width = w;
//        depth = d;
//        name = n;
//    }

//    public Box(int h, int w, int d, String n) {
//        this.height = h;
//        this.width = w;
//        this.depth = d;
//        this.name = n;
//    }

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

    public Box(int height, int width, int depth, String name) {
        this(height, width, depth); // может быть только первой строкой
//        this(); ошибка компиляции, может быть только один вызов конструктора через this
//        printName();
        this.name = name;
    }

    int calculateVolume() {
        return this.height * this.width * this.depth;
    }

    void printName() {
        // ...
    }

    Box cloneBox() {
        return new Box(this); // this - это и есть текущий объект
    }

    void printCounter() {
        System.out.println(counter);
    }
}


