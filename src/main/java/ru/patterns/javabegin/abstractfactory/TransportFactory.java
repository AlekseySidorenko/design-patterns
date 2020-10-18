package ru.patterns.javabegin.abstractfactory;

public interface TransportFactory {
    Car createCar();

    Aircraft createAircraft();
}
