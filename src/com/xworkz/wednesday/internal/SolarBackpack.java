package com.xworkz.wednesday.internal;

public class SolarBackpack
{
    private String brand;
    private int wattageOutput;
    private boolean usbCharging;

    public SolarBackpack(String brand, int wattageOutput, boolean usbCharging) {
        this.brand = brand;
        this.wattageOutput = wattageOutput;
        this.usbCharging = usbCharging;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Wattage Output: " + wattageOutput + "W, USB Charging: " + usbCharging;
    }

}

