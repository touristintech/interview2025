package com.touristintech.java.main.design_patterns.structural_dp.adapter_dp;

public class Adapter120Volt extends Volt120 {

    private Volt12 volt12;

    public Adapter120Volt(Volt12 volt12) {
        this.volt12 = volt12;
    }

    public void getVolt(int volt) {
        volt12.get12Volt(volt);
    }

}
