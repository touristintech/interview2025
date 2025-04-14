package com.touristintech.java.main.design_patterns.structural_dp.adapter_dp;

public class AdapterDP {

    public static void main(String[] args) {
        Volt120 volt120 = new Volt120();
        volt120.get120Volt(120);

        // Here we are adapting 12 Volt with the 120 Volt adapter
        Volt12 volt12 = new Volt12();
        Adapter120Volt adapter = new Adapter120Volt(volt12);
        adapter.get120Volt(12);
    }
}
