package ru.patterns.headfirst._01_strategy.entity.duck;

import ru.patterns.headfirst._01_strategy.entity.behavior.fly.impl.FlyNoWayBehavior;
import ru.patterns.headfirst._01_strategy.entity.behavior.quack.impl.RegularQuackBehavior;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWayBehavior();
        quackBehavior = new RegularQuackBehavior();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
