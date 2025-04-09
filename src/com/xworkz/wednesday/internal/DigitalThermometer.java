package com.xworkz.wednesday.internal;

public class DigitalThermometer
{
    private double temperature;
    private boolean bluetoothEnabled;
    private String unit;

    public DigitalThermometer(double temperature, boolean bluetoothEnabled, String unit) {
        this.temperature = temperature;
        this.bluetoothEnabled = bluetoothEnabled;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Temperature: " + temperature + unit + ", Bluetooth: " + bluetoothEnabled;
    }
}


