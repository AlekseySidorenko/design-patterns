package ru.patterns.javabegin.factory;

public class Jeep implements Car {
    @Override
    public void drive() {
        System.out.println("Speed 160");
    }
}