package com.xworkz.wednesday.internal;

public class BeardTrimmer
{
    private String brand;
    private int lengthSettings;
    private boolean cordless;

    public BeardTrimmer(String brand, int lengthSettings, boolean cordless) {
        this.brand = brand;
        this.lengthSettings = lengthSettings;
        this.cordless = cordless;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Length Settings: " + lengthSettings + ", Cordless: " + cordless;
    }
    @Override
    public int hashCode() {
        return 10;
    }
}




