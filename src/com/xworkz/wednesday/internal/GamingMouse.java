package com.xworkz.wednesday.internal;

public class GamingMouse
{
    private String brand;
    private int dpi;
    private boolean rgbLighting;

    public GamingMouse(String brand, int dpi, boolean rgbLighting) {
        this.brand = brand;
        this.dpi = dpi;
        this.rgbLighting = rgbLighting;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", DPI: " + dpi + ", RGB Lighting: " + rgbLighting;
    }
}

