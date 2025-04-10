package com.xworkz.wednesday.internal;

public class Projector
{
    private String brand;
    private int lumens;
    private boolean hd;

    public Projector(String brand, int lumens, boolean hd) {
        this.brand = brand;
        this.lumens = lumens;
        this.hd = hd;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Lumens: " + lumens + ", HD: " + hd;
    }
    @Override
    public int hashCode() {
        return 506;
    }
}


