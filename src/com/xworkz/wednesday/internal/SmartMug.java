package com.xworkz.wednesday.internal;

public class SmartMug
{
    private String brand;
    private int temperature;
    private boolean appControlled;

    public SmartMug(String brand, int temperature, boolean appControlled) {
        this.brand = brand;
        this.temperature = temperature;
        this.appControlled = appControlled;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Temperature: " + temperature + "°C, App Controlled: " + appControlled;
    }
}

