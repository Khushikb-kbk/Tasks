package com.xworkz.wednesday.internal;

public class SmartThermostat
{
    private String brand;
    private boolean remoteControl;
    private int temperatureRange;

    public SmartThermostat(String brand, boolean remoteControl, int temperatureRange) {
        this.brand = brand;
        this.remoteControl = remoteControl;
        this.temperatureRange = temperatureRange;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Remote Control: " + remoteControl + ", Temperature Range: " + temperatureRange + "°C";
    }
}


