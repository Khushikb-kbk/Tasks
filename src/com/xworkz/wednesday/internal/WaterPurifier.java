package com.xworkz.wednesday.internal;

public class WaterPurifier
{
    private String brand;
    private int capacity;
    private boolean roTechnology;

    public WaterPurifier(String brand, int capacity, boolean roTechnology) {
        this.brand = brand;
        this.capacity = capacity;
        this.roTechnology = roTechnology;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Capacity: " + capacity + "L, RO Technology: " + roTechnology;
    }
}



