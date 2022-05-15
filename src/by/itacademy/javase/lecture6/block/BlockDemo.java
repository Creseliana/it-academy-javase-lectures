package by.itacademy.javase.lecture6.block;

public class BlockDemo {

//    System.out.println("BlockDemo class - no block"); // cannot be executed

    static int number = 0;

    static {
        System.out.println("BlockDemo class - static block 1");
        number = 5;
    }

    {
        System.out.println("BlockDemo class - non-static block 2");
        number = 7;
    } // won't be executed until class instantiation

    public BlockDemo() {
        System.out.println("BlockDemo class - in constructor");
    }

    public static void main(String[] args) {
        Block block = new Block(1);
//        new BlockDemo();
        System.out.println(number);
    }

    static {
        System.out.println("BlockDemo class - static block 2");
    }

    {
        System.out.println("BlockDemo class - non-static block 1");
    } // won't be executed until class instantiation
}
