package com.xworkz.wednesday.internal;

public class SmartPillow
{
    private boolean sleepTracking;
    private int softnessLevel;
    private String fabricType;

    public SmartPillow(boolean sleepTracking, int softnessLevel, String fabricType) {
        this.sleepTracking = sleepTracking;
        this.softnessLevel = softnessLevel;
        this.fabricType = fabricType;
    }

    @Override
    public String toString() {
        return "Sleep Tracking: " + sleepTracking + ", Softness Level: " + softnessLevel + ", Fabric: " + fabricType;
    }
    @Override
    public int hashCode() {
        return 690;
    }
}


