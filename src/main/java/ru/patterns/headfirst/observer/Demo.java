package ru.patterns.headfirst.observer;

public class Demo {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay display = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(23, 65, 30.4f);
        weatherData.setMeasurements(12, 11, 31.2f);
        weatherData.setMeasurements(0, 93, 30.9f);
    }
}
