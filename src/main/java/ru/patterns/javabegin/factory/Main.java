package ru.patterns.javabegin.factory;

public class Main {
    public static void main(String[] args) {
        Car jeep = CarSelector.getInstance().getCar(RoadType.OFFROAD);
        Car skyline = CarSelector.getInstance().getCar(RoadType.CITY);
        System.out.println(jeep.getClass());
        System.out.println(skyline.getClass());
    }
}