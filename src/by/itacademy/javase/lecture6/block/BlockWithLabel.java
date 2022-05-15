package by.itacademy.javase.lecture6.block;

public class BlockWithLabel {

    {
        second:
        {
            third:
            {
                System.out.println("Beginning of the third block");
                if (true) {
                    break second;
                }
                System.out.println("End of the third block"); // won't be executed
            }
            System.out.println("Second block"); // won't be executed
        }
        System.out.println("First block");
    }

    public static void main(String[] args) {
        new BlockWithLabel();

        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Beginning of the third block");
                    if (true) {
                        break second;
                    }
                    System.out.println("End of the third block"); // won't be executed
                }
                System.out.println("Second block"); // won't be executed
            }
            System.out.println("First block");
        }
    }
}
