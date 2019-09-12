package ru.patterns.javabegin.singleton;

public class SingletonUsing {
    public static void main(String[] args) {
        LazySingleton.getInstance().print();
        LazySingleton.getInstance().print();
        LazySingleton.getInstance().print();

        Singleton.getInstance().print();
        Singleton.getInstance().print();
        Singleton.getInstance().print();
    }
}