package com.xworkz.wednesday.internal;

public class WirelessCharger
{
    private String brand;
    private int wattage;
    private boolean fastCharge;

    public WirelessCharger(String brand, int wattage, boolean fastCharge) {
        this.brand = brand;
        this.wattage = wattage;
        this.fastCharge = fastCharge;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Wattage: " + wattage + "W, Fast Charge: " + fastCharge;
    }
}


