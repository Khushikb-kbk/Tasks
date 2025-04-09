package com.xworkz.wednesday.internal;

public class SmartPlug
{
    private String brand;
    private boolean voiceControl;
    private int maxLoad;

    public SmartPlug(String brand, boolean voiceControl, int maxLoad) {
        this.brand = brand;
        this.voiceControl = voiceControl;
        this.maxLoad = maxLoad;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Voice Control: " + voiceControl + ", Max Load: " + maxLoad + "W";
    }
}



