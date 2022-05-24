package by.itacademy.javase.lecture6.example;

public class CoffeeMachine {

    private static final double COFFEE_CUP_SIZE = 0.2;
    private static final double MILK_CUP_SIZE = 0.1;
    private static final int BEAN_CUP_SIZE = 30;

    // выбор кофе (латте, американо, эспрессо, капучино)
    public static final int LATTE = 1;
    public static final int AMERICANO = 2;
    public static final int ESPRESSO = 3;
    public static final int CAPPUCCINO = 4;

    // степень помола
    public static final int SMALL = 1;
    public static final int MEDIUM = 2;
    public static final int LARGE = 3;

    // производитель
    private String name;

    // степень помола
    private int grindingType;

    // максимальный объем
    private double totalWaterVolume;

    // объем воды
    private double currentWaterVolume;

    // максимальный объем
    private double totalMilkVolume;

    // объем молока
    private double currentMilkVolume;

    // максимальное количество зерен
    private int totalBeanAmount;

    // количество зерен
    private int currentBeanAmount;

    // сахар
    private boolean withSugar;

    // признак включенности
    private boolean isOn;

    public CoffeeMachine() {
        System.out.println("Non functional coffee machine");
    }

    public CoffeeMachine(String name, double totalWaterVolume, double totalMilkVolume,
        int totalBeanAmount) {
        this.name = name;
        this.totalWaterVolume = totalWaterVolume;
        this.totalMilkVolume = totalMilkVolume;
        this.totalBeanAmount = totalBeanAmount;
        this.isOn = false;
        this.grindingType = 1;
        this.currentWaterVolume = 0;
        this.currentMilkVolume = 0;
        this.currentBeanAmount = 0;
        System.out.println("Congrats, you have new coffee machine!!!");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrindingType() {
        return grindingType;
    }

    public void setGrindingType(int grindingType) {
        this.grindingType = grindingType;
    }

    public double getTotalWaterVolume() {
        return totalWaterVolume;
    }

    public void setTotalWaterVolume(double totalWaterVolume) {
        this.totalWaterVolume = totalWaterVolume;
    }

    public double getCurrentWaterVolume() {
        return currentWaterVolume;
    }

    public void setCurrentWaterVolume(double currentWaterVolume) {
        this.currentWaterVolume = currentWaterVolume;
    }

    public double getTotalMilkVolume() {
        return totalMilkVolume;
    }

    public void setTotalMilkVolume(double totalMilkVolume) {
        this.totalMilkVolume = totalMilkVolume;
    }

    public double getCurrentMilkVolume() {
        return currentMilkVolume;
    }

    public void setCurrentMilkVolume(double currentMilkVolume) {
        this.currentMilkVolume = currentMilkVolume;
    }

    public int getTotalBeanAmount() {
        return totalBeanAmount;
    }

    public void setTotalBeanAmount(int totalBeanAmount) {
        this.totalBeanAmount = totalBeanAmount;
    }

    public int getCurrentBeanAmount() {
        return currentBeanAmount;
    }

    public void setCurrentBeanAmount(int currentBeanAmount) {
        this.currentBeanAmount = currentBeanAmount;
    }

    public boolean isWithSugar() {
        return withSugar;
    }

    public void setWithSugar(boolean withSugar) {
        this.withSugar = withSugar;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    // МЕТОДЫ:
    // очистка

    // метод приготовления кофе (тип кофе, помол, сахар)
    public void makeCoffee(int coffeeType, int grindingType) {
        boolean isCoffeeWithMilk;
        if (!isOn) {
            System.out.println("Coffee cannot be made. Machine is off.");
            return;
        }

        if (coffeeType < 1 || coffeeType > 4) {
            System.out.println("Unknown coffee type.");
            return;
        }

        if (grindingType != SMALL && grindingType != MEDIUM && grindingType != LARGE) {
            System.out.println("Unknown grinding type.");
            return;
        }

        isCoffeeWithMilk = isCoffeeWithMilk(coffeeType);

        if (!canMakeCoffee(isCoffeeWithMilk)) {
            System.out.println("Coffee cannot be made.");
            return;
        }

        currentWaterVolume -= COFFEE_CUP_SIZE;
        currentBeanAmount -= BEAN_CUP_SIZE;

        if (isCoffeeWithMilk) {
            currentMilkVolume -= MILK_CUP_SIZE;
        }

        System.out.println("Coffee is ready!");
        canMakeCoffee(true);
    }


    // наполнение воды
    public void loadWater(double waterVolume) {
        if (waterVolume + currentWaterVolume < totalWaterVolume) {
            currentWaterVolume += waterVolume;
        } else {
            currentWaterVolume = totalWaterVolume;
        }
    }

    // наполнение молока
    public void loadMilk(double milkVolume) {
        currentMilkVolume = (milkVolume + currentMilkVolume < totalMilkVolume)
            ? currentMilkVolume + milkVolume : totalMilkVolume;
    }

    // наполнение зерен
    public void loadBeans(double beanAmount) {
        if (beanAmount + currentBeanAmount < totalBeanAmount) {
            currentBeanAmount += beanAmount;
        } else {
            currentBeanAmount = totalBeanAmount;
        }
    }

    // метод включения/выключения
    public void power() {
        if (isOn) {
            isOn = false;
            System.out.println("Coffee machine is off...");
        } else {
            isOn = true;
            System.out.println("Coffee machine is on...");
        }
    }

    public CoffeeMachine getFullestCoffeeMachine(CoffeeMachine coffeeMachine) {
        if (this.totalWaterVolume > coffeeMachine.totalWaterVolume
            && this.totalMilkVolume > coffeeMachine.totalMilkVolume
            && this.totalBeanAmount > coffeeMachine.totalBeanAmount) {
            return this;
        }
        return coffeeMachine;
    }

    public void printCoffeeMachineInfo() {
        System.out.println("Coffee machine " + name + ": " +
            "\n - water level " + currentWaterVolume +
            "\n - milk level " + currentMilkVolume +
            "\n - bean level " + currentBeanAmount
        );
    }

    public String getCoffeeMachineInfo() {
        return "Coffee machine " + name + ": " +
            "\n + water level " + currentWaterVolume +
            "\n + milk level " + currentMilkVolume +
            "\n + bean level " + currentBeanAmount;
    }

    private boolean canMakeCoffee(boolean withMilk) {
        boolean canMake = true;
        if (currentWaterVolume < COFFEE_CUP_SIZE) {
            System.out.println("Not enough water");
            canMake = false;
        }
        if (withMilk && currentMilkVolume < MILK_CUP_SIZE) {
            System.out.println("Not enough milk");
            canMake = false;
        }
        if (currentBeanAmount < BEAN_CUP_SIZE) {
            System.out.println("Not enough beans");
            canMake = false;
        }
        return canMake;
    }

    private boolean isCoffeeWithMilk(int type) {
        return type == CAPPUCCINO || type == LATTE;
    }
}
