package ru.patterns.headfirst._01_strategy.entity.behavior.quack.impl;

import ru.patterns.headfirst._01_strategy.entity.behavior.quack.QuackBehavior;

public class RegularQuackBehavior implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
