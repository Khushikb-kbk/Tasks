package com.xworkz.wednesday.internal;

public class DigitalShoe
{
    private String model;
    private int stepsTracked;
    private boolean autoLacing;

    public DigitalShoe(String model, int stepsTracked, boolean autoLacing) {
        this.model = model;
        this.stepsTracked = stepsTracked;
        this.autoLacing = autoLacing;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Steps Tracked: " + stepsTracked + ", Auto Lacing: " + autoLacing;
    }
    @Override
    public int hashCode() {
        return 230;
    }
}


