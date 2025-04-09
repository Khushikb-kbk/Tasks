package com.xworkz.wednesday.internal;

public class DigitalRuler
{
    private int length;
    private boolean laserGuided;
    private String unit;

    public DigitalRuler(int length, boolean laserGuided, String unit) {
        this.length = length;
        this.laserGuided = laserGuided;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Length: " + length + unit + ", Laser Guided: " + laserGuided;
    }
}

