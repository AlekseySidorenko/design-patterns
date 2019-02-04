package ru.patterns.strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRockedPowered());
        model.performFly();

        System.out.println("--------");

        Manok manok = new Manok();
        manok.setQuackBehavior(new Squeak());
        manok.performQuack();
    }
}
