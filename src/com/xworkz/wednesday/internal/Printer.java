package com.xworkz.wednesday.internal;

public class Printer
{
    private String brand;
    private boolean color;
    private int ppm;

    public Printer(String brand, boolean color, int ppm) {
        this.brand = brand;
        this.color = color;
        this.ppm = ppm;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Color: " + color + ", PPM: " + ppm;
    }
}


