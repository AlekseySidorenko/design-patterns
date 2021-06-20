package ru.patterns.headfirst.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        log.info("{} ${}", beverage.getDescription(), beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        log.info("{} ${}", beverage2.getDescription(), beverage2.cost());
    }

}