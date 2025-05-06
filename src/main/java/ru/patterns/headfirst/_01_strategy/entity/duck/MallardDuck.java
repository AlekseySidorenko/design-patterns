package ru.patterns.headfirst._01_strategy.entity.duck;

import ru.patterns.headfirst._01_strategy.entity.behavior.fly.impl.FlyWithWingsBehavior;
import ru.patterns.headfirst._01_strategy.entity.behavior.quack.impl.RegularQuackBehavior;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new RegularQuackBehavior();
        flyBehavior = new FlyWithWingsBehavior();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck!");
    }
}
