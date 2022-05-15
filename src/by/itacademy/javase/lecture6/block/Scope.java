package by.itacademy.javase.lecture6.block;

public class Scope {

    static int staticNumber;
    int nonStaticNumber;

    {
        int blockVariable = 1;
    }

    static void staticMethod() {
        staticNumber = 2;
//        nonStaticNumber = 2; // not visible here
    }

    void nonStaticMethod() {
        staticNumber = 1;
        nonStaticNumber = 1;
    }

    void methodWithParam(int methodParam) {
        methodParam = 1;
    }

    void testMethod() {
//        methodParam = 2; // not visible here
//        blockVariable = 2; // not visible here
        {
            int methodBlockVariable = 1; // not visible here
        }
//        methodBlockVariable = 1;
    }

    void methodWithLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            int loopVariable = 1;
        }

//        System.out.println(i); // not visible here
//        loopVariable = 2; // not visible here
    }
}
