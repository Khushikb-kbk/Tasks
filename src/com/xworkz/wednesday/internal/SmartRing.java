package com.xworkz.wednesday.internal;

public class SmartRing
{
    private String material;
    private boolean heartRateSensor;
    private int batteryDays;

    public SmartRing(String material, boolean heartRateSensor, int batteryDays) {
        this.material = material;
        this.heartRateSensor = heartRateSensor;
        this.batteryDays = batteryDays;
    }

    @Override
    public String toString() {
        return "Material: " + material + ", Heart Rate Sensor: " + heartRateSensor + ", Battery: " + batteryDays + " days";
    }
}

