package com.xworkz.wednesday.internal;

public class GameConsole
{
    private String brand;
    private String model;
    private boolean portable;

    public GameConsole(String brand, String model, boolean portable) {
        this.brand = brand;
        this.model = model;
        this.portable = portable;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Portable: " + portable;
    }
}

