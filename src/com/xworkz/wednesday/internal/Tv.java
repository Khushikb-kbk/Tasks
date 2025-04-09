package com.xworkz.wednesday.internal;

public class Tv
{
    private String brand;
    private int size;
    private boolean smart;

    public Tv(String brand, int size, boolean smart) {
        this.brand = brand;
        this.size = size;
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Size: " + size + "\", Smart TV: " + smart;
    }
}

