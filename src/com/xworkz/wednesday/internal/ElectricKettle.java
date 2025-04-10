package com.xworkz.wednesday.internal;

public class ElectricKettle
{
    private String brand;
    private double capacity;
    private boolean autoShutoff;

    public ElectricKettle(String brand, double capacity, boolean autoShutoff) {
        this.brand = brand;
        this.capacity = capacity;
        this.autoShutoff = autoShutoff;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Capacity: " + capacity + "L, Auto Shutoff: " + autoShutoff;
    }
    @Override
    public int hashCode() {
        return 270;
    }
}


