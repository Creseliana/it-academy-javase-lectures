package by.itacademy.javase.lecture6.example;

import static by.itacademy.javase.lecture6.example.CoffeeMachine.AMERICANO;
import static by.itacademy.javase.lecture6.example.CoffeeMachine.CAPPUCCINO;
import static by.itacademy.javase.lecture6.example.CoffeeMachine.LARGE;
import static by.itacademy.javase.lecture6.example.CoffeeMachine.LATTE;
import static by.itacademy.javase.lecture6.example.CoffeeMachine.MEDIUM;
import static by.itacademy.javase.lecture6.example.CoffeeMachine.SMALL;

public class CoffeeMachineDemo {

    public static void main(String[] args) {
//        CoffeeMachine emptyCoffeeMachine = new CoffeeMachine();
        CoffeeMachine coffeeMachine = new CoffeeMachine("DeLonghi 111", 5.0, 0.5, 200);
        CoffeeMachine coffeeMachine1 = new CoffeeMachine("DeLonghi 222", 4.0, 0.4, 100);

        coffeeMachine.getFullestCoffeeMachine(coffeeMachine1).printCoffeeMachineInfo();
        coffeeMachine1.getFullestCoffeeMachine(coffeeMachine).printCoffeeMachineInfo();

        System.out.println(getFullestCoffeeMachineMain(coffeeMachine, coffeeMachine1).getName());;

        coffeeMachine.power();
        coffeeMachine.loadWater(6.0);
        System.out.println(coffeeMachine.getCurrentWaterVolume());
        coffeeMachine.loadBeans(200);
        coffeeMachine.loadMilk(0.2);
        coffeeMachine.makeCoffee(LATTE, SMALL);
        coffeeMachine.printCoffeeMachineInfo();
        coffeeMachine.makeCoffee(AMERICANO, LARGE);
        System.out.println(coffeeMachine.getCoffeeMachineInfo());
        coffeeMachine.makeCoffee(-5, MEDIUM);
        coffeeMachine.makeCoffee(LATTE, 5);
        coffeeMachine.makeCoffee(CAPPUCCINO, SMALL);
        coffeeMachine.printCoffeeMachineInfo();
        coffeeMachine.loadMilk(1);
        System.out.println(coffeeMachine.getCurrentMilkVolume());
    }

    static CoffeeMachine getFullestCoffeeMachineMain(CoffeeMachine m1, CoffeeMachine m2) {
        if (m1.getTotalWaterVolume() > m2.getTotalWaterVolume()
            && m1.getTotalMilkVolume() > m2.getTotalMilkVolume()
            && m1.getTotalBeanAmount() > m2.getTotalBeanAmount()) {
            return m1;
        }
        return m2;
    }
}
