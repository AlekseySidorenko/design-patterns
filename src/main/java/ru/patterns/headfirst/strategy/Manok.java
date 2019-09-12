package ru.patterns.headfirst.strategy;

public class Manok {
    QuackBehavior quackBehavior;

    public Manok() {

    }
    public void performQuack() {
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }


}
