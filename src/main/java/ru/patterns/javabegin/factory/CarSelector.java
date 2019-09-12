package ru.patterns.javabegin.factory;

public class CarSelector {

    private static CarSelector carSelector = new CarSelector();

    private CarSelector() {
    }

    public static CarSelector getInstance() {
        return carSelector;
    }

    public static Car getCar(RoadType roadType) {
        Car car = null;
        switch (roadType) {
            case CITY:
                car = new Skyline();
                break;
            case OFFROAD:
                car = new Jeep();
                break;
        }
        return car;
    }
}