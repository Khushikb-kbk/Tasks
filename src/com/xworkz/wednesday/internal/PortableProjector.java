package com.xworkz.wednesday.internal;

public class PortableProjector
{
    private String brand;
    private int lumens;
    private boolean hdSupport;

    public PortableProjector(String brand, int lumens, boolean hdSupport) {
        this.brand = brand;
        this.lumens = lumens;
        this.hdSupport = hdSupport;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Lumens: " + lumens + ", HD Support: " + hdSupport;
    }
}



