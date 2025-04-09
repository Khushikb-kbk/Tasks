package com.xworkz.wednesday.internal;

public class DigitalPaintPalette
{
    private int colorCount;
    private boolean pressureSensitive;
    private String model;

    public DigitalPaintPalette(int colorCount, boolean pressureSensitive, String model) {
        this.colorCount = colorCount;
        this.pressureSensitive = pressureSensitive;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Colors: " + colorCount + ", Pressure Sensitive: " + pressureSensitive + ", Model: " + model;
    }
}

