package com.touristintech.java.main;

import com.touristintech.java.main.design_patterns.creational_dp.BuilderDP;
import com.touristintech.java.main.design_patterns.creational_dp.SingletonDP;

public class MainClass {
    public static void main(String[] args) {

/*
        // Testing Singleton DP
        SingletonDP sdp;
        sdp = SingletonDP.getInstance();

        System.out.println("Instance is available: " + (sdp.isInstanceAvailable() ? "YES" : "NO"));

=========================================================================================================================

*/

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
    }
}
