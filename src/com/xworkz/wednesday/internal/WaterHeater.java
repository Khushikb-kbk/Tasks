package com.xworkz.wednesday.internal;

public class WaterHeater
{
    private String brand;
    private int capacity;
    private boolean instant;

    public WaterHeater(String brand, int capacity, boolean instant) {
        this.brand = brand;
        this.capacity = capacity;
        this.instant = instant;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Capacity: " + capacity + "L, Instant: " + instant;
    }
}

