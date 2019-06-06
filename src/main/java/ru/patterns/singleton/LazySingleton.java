package ru.patterns.singleton;

public class LazySingleton {

    private static LazySingleton singleton;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }

    public void print() {
        System.out.println(singleton);
    }
}