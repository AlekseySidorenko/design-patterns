package ru.patterns.headfirst._01_strategy.entity.behavior.fly.impl;

import ru.patterns.headfirst._01_strategy.entity.behavior.fly.FlyBehavior;

public class FlyRockedPoweredBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
