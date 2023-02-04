package class17.hm;

public class CoffeeTester {
    public static void main(String[] args) {
        Coffee1 cup = new Coffee1("Latte","small",4);
        cup.printInfo();

        Coffee1 bottle = new Coffee1();
        bottle.printInfo();

    }
}
