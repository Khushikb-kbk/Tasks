package com.xworkz.wednesday.internal;

public class
FitnessTracker
{
    private String brand;
    private boolean heartRateMonitor;
    private int batteryLife;

    public FitnessTracker(String brand, boolean heartRateMonitor, int batteryLife) {
        this.brand = brand;
        this.heartRateMonitor = heartRateMonitor;
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Heart Rate Monitor: " + heartRateMonitor + ", Battery Life: " + batteryLife + " days";
    }
}

