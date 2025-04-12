package com.touristintech.java.main.design_patterns.creational_dp;

public class SingletonDP {

    private SingletonDP() {}

    private static SingletonDP INSTANCE;

    public static SingletonDP getInstance() {
        // It creates instance if there is no instance available
        if (INSTANCE == null) {
            INSTANCE = new SingletonDP();
        }
        return INSTANCE;
    }

    public boolean isInstanceAvailable() {
        return INSTANCE != null;
    }
}
