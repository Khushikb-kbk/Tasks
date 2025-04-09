package com.xworkz.wednesday.internal;

public class Router
{
    private String brand;
    private int range;
    private boolean dualBand;

    public Router(String brand, int range, boolean dualBand) {
        this.brand = brand;
        this.range = range;
        this.dualBand = dualBand;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Range: " + range + "m, Dual Band: " + dualBand;
    }
}

