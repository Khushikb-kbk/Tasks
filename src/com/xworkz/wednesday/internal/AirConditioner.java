package com.xworkz.wednesday.internal;

public class AirConditioner
{
    private String brand;
    private int tonnage;
    private boolean inverter;

    public AirConditioner(String brand, int tonnage, boolean inverter) {
        this.brand = brand;
        this.tonnage = tonnage;
        this.inverter = inverter;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Tonnage: " + tonnage + " Ton, Inverter: " + inverter;
    }
}


