package com.xworkz.wednesday.internal;

public class BluetoothSpeaker

{
    private String brand;
    private int batteryCapacity;
    private boolean waterproof;

    public BluetoothSpeaker(String brand, int batteryCapacity, boolean waterproof) {
        this.brand = brand;
        this.batteryCapacity = batteryCapacity;
        this.waterproof = waterproof;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Battery: " + batteryCapacity + " mAh, Waterproof: " + waterproof;
    }
}


