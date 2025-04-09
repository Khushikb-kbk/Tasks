package com.xworkz.wednesday.internal;

public class Scanner
{
    private String brand;
    private int resolution;
    private boolean portable;

    public Scanner(String brand, int resolution, boolean portable) {
        this.brand = brand;
        this.resolution = resolution;
        this.portable = portable;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Resolution: " + resolution + "dpi, Portable: " + portable;
    }
}


