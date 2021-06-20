package ru.patterns.headfirst.decorator;

import lombok.Getter;
import lombok.Setter;

public abstract class Beverage {

    @Getter
    @Setter
    Size size = Size.TALL;

    @Getter
    String description = "Unknown beverage";

    public abstract double cost();

    public enum Size {TALL, GRANDE, VENTI}

}