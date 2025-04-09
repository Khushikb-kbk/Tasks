package com.xworkz.wednesday.internal;

public class WashingMachine
{
    private String brand;
    private int loadCapacity;
    private boolean frontLoad;

    public WashingMachine(String brand, int loadCapacity, boolean frontLoad) {
        this.brand = brand;
        this.loadCapacity = loadCapacity;
        this.frontLoad = frontLoad;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Load Capacity: " + loadCapacity + "kg, Front Load: " + frontLoad;
    }
}


