package com.patterns.base;
import com.patterns.java.BikeColor;
/* This parent class will work with Down Hill Bikes */
public class DownHill extends AbstractMountainBike{

    public DownHill(WheelInterface wheel, BikeColor color) {
        super(wheel, color);
    }

    public DownHill(WheelInterface wheel) {
        this(wheel, BikeColor.GREEN);
    }

    @Override
    public float getPrice() {
        return 870.00f;
    }
}
