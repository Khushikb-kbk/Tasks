package com.xworkz.wednesday.internal;

public class DigitalCompass
{
    private String model;
    private boolean gpsEnabled;
    private double accuracy;

    public DigitalCompass(String model, boolean gpsEnabled, double accuracy) {
        this.model = model;
        this.gpsEnabled = gpsEnabled;
        this.accuracy = accuracy;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", GPS Enabled: " + gpsEnabled + ", Accuracy: ±" + accuracy + "°";
    }
}


