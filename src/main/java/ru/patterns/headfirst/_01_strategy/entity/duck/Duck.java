package ru.patterns.headfirst._01_strategy.entity.duck;

import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.patterns.headfirst._01_strategy.entity.behavior.fly.FlyBehavior;
import ru.patterns.headfirst._01_strategy.entity.behavior.quack.QuackBehavior;

@Setter
@NoArgsConstructor
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

}


