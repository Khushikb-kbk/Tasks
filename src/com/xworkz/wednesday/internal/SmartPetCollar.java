package com.xworkz.wednesday.internal;

public class SmartPetCollar
{
    private boolean gpsEnabled;
    private int batteryHours;

    public SmartPetCollar(String petName, boolean gpsEnabled, int batteryHours) {
        this.gpsEnabled = gpsEnabled;
        this.batteryHours = batteryHours;
    }

    @Override
    public String toString() {
        return   ", GPS Enabled: " + gpsEnabled + ", Battery: " + batteryHours + " hrs";
    }
}

