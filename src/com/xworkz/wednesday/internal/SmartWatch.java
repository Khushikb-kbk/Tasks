package com.xworkz.wednesday.internal;

public class SmartWatch
{
    private String brand;
    private boolean waterproof;
    private int batteryLife;

    public SmartWatch(String brand, boolean waterproof, int batteryLife) {
        this.brand = brand;
        this.waterproof = waterproof;
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Waterproof: " + waterproof + ", Battery Life: " + batteryLife + "h";
    }
}



