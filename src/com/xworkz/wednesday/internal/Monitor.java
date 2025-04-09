package com.xworkz.wednesday.internal;

public class Monitor
{
    private String brand;
    private double size;
    private String resolution;

    public Monitor(String brand, double size, String resolution) {
        this.brand = brand;
        this.size = size;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Size: " + size + ", Resolution: " + resolution;
    }
}

