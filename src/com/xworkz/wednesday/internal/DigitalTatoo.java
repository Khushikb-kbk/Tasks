package com.xworkz.wednesday.internal;

public class DigitalTatoo
{
    private String design;
    private boolean animated;
    private int batteryLife;

    public DigitalTatoo(String design, boolean animated, int batteryLife) {
        this.design = design;
        this.animated = animated;
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "Design: " + design + ", Animated: " + animated + ", Battery Life: " + batteryLife + " hours";
    }
}


