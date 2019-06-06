package ru.patterns.singleton;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        return singleton;
    }

    public void print() {
        System.out.println(singleton);
    }
}