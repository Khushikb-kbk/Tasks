package com.xworkz.wednesday.internal;

public class Tablet
{
    private String brand;
    private double screenSize;
    private boolean stylusSupport;

    public Tablet(String brand, double screenSize, boolean stylusSupport) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.stylusSupport = stylusSupport;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Screen Size: " + screenSize + "\", Stylus Support: " + stylusSupport;
    }
}

