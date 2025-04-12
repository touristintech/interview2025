package com.touristintech.java.main;

import com.touristintech.java.main.design_patterns.creational_dp.SingletonDP;

public class MainClass {
    public static void main(String[] args) {
        SingletonDP sdp;
        sdp = SingletonDP.getInstance();

        System.out.println("Instance is available: " + (sdp.isInstanceAvailable() ? "YES" : "NO"));
    }
}
