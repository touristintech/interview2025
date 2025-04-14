package com.touristintech.java.main.design_patterns.creational_dp.factory_pattern;

// For factory method design pattern, we can create an interface, or abstract class or any normal java class to be a supper class
// here we are going with the interface, Shape is an interface defined in factory_pattern package

public class FactoryMethodDP {

    public static Shape getShape(int side, String type) {
        if ("Triangle".equalsIgnoreCase(type)) {
            return new Triangle(side, type);
        } else if ("Square".equalsIgnoreCase(type)) {
            return new Square(side, type);
        } else if ("Rectangle".equalsIgnoreCase(type)) {
            return new Rectangle(side, type);
        }

        return null;
    }
}
