package by.itacademy.javase.lecture6.block;

public class Block {

    static {
        System.out.println("Block class - static block 1");
    }

    static {
        System.out.println("Block class - static block 2");
    }

    private int number;

    {
        System.out.println("Block class - non-static block 1");
    }

    {
        System.out.println("Block class - non-static block 2");
    }

    public Block(int number) {
        System.out.println("Block class - in constructor");
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) { // в методах не влияют
        System.out.println(number);
        {
            System.out.println("block 1 in method");
        }
        this.number = number;
        System.out.println(number);
        {
            System.out.println("block 2 in method");
        }
        System.out.println(number);
    }
}
