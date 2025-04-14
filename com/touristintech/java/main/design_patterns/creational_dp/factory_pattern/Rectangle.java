package com.touristintech.java.main.design_patterns.creational_dp.factory_pattern;

class Rectangle implements Shape {

    int side;
    String type;

    public Rectangle(int side, String type) {
        this.side = side;
        this.type = type;
    }

    @Override
    public int getSide() {
        return this.side;
    }

    @Override
    public String getType() {
        return this.type;
    }
}
