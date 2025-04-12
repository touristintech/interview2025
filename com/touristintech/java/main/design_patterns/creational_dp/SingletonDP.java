package com.touristintech.java.main.design_patterns.creational_dp;

public class SingletonDP {

    private SingletonDP() {}

/*
    // In this block we are doing lazy instantiation
    // Here, we are checking if the instance is already available
    // if it is then we return that else creating a new one
    private static SingletonDP INSTANCE;

    public static SingletonDP getInstance() {
        // It creates instance if there is no instance available
        if (INSTANCE == null) {
            INSTANCE = new SingletonDP();
        }
        return INSTANCE;
    }

======================================================================

    // In this block we are doing eager instantiation
    // Whenever it is required we are creating an Object so
    // it's called eager instantiation
    private static final SingletonDP INSTANCE = new SingletonDP();

    public static SingletonDP getInstance() {
        return INSTANCE;
    }

======================================================================

// Both the approaches discussed above are not thread safe, so now
// we'll implement few thread safe approaches

    // Using synchronized method for making this thread safe
    // implementation
    private static SingletonDP INSTANCE;

    public static synchronized SingletonDP getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonDP();
        }
        return INSTANCE;
    }
*/
    // With the above approach, we are taking the overhead of synchronization
    // as we are synchronizing the complete method, so it's an expensive task which we are doing.

    // Now we can optimize the above code where we can just synchronize the required part
    // this approach also known as double-checked locking approach

    private static SingletonDP INSTANCE;

    public static SingletonDP getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonDP.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonDP();
                }
            }
        }
        return INSTANCE;
    }
    public boolean isInstanceAvailable() {
        return INSTANCE != null;
    }
}
