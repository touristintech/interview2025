package com.touristintech.java.main;

import com.touristintech.java.main.design_patterns.creational_dp.factory_pattern.FactoryMethodDP;
import com.touristintech.java.main.design_patterns.creational_dp.factory_pattern.Shape;

public class MainClass {
    public static void main(String[] args) {

/*
        // Testing Singleton DP
        SingletonDP sdp;
        sdp = SingletonDP.getInstance();

        System.out.println("Instance is available: " + (sdp.isInstanceAvailable() ? "YES" : "NO"));

===========================================================================================================

// Testing Builder Design Pattern
        // Setting the values
        BuilderDP builderDesignPattern = new BuilderDP
                .BuilderDPBuilder(1, 2000)// The required parameter which are passed inside constructor
                .withName("ABC")
                .withDepartment("ZXY")
                .build();

        // Getting the values
        System.out.println("Getting the data from the builder pattern\n");
        System.out.println("Name is: " + builderDesignPattern.getName() +
                            "\nDepartment is: " + builderDesignPattern.getDept() +
                            "\nEmployee Code is: " + builderDesignPattern.getEmpCode() +
                            "\nSalary is: " + builderDesignPattern.getSalary());

===========================================================================================================
// Testing Factory Method Design Pattern
 */

        Shape triangle = FactoryMethodDP.getShape(3, "Triangle");
        Shape square = FactoryMethodDP.getShape(4, "Square");

        System.out.println("Sides of triangle are: " + triangle.getSide() +", and Sides of Square are: "+ square.getSide());

    }
}
