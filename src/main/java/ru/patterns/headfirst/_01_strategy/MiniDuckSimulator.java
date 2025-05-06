package ru.patterns.headfirst._01_strategy;

import ru.patterns.headfirst._01_strategy.entity.behavior.fly.impl.FlyRockedPoweredBehavior;
import ru.patterns.headfirst._01_strategy.entity.behavior.quack.impl.SqueakBehavior;
import ru.patterns.headfirst._01_strategy.entity.tool.Decoy;
import ru.patterns.headfirst._01_strategy.entity.duck.Duck;
import ru.patterns.headfirst._01_strategy.entity.duck.MallardDuck;
import ru.patterns.headfirst._01_strategy.entity.duck.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRockedPoweredBehavior());
        model.performFly();

        System.out.println("--------");

        Decoy decoy = new Decoy();
        decoy.setQuackBehavior(new SqueakBehavior());
        decoy.performQuack();
    }
}
