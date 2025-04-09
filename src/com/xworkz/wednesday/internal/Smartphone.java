package com.xworkz.wednesday.internal;

public class Smartphone
{
    private String brand;
    private String model;
    private int storage;

    public Smartphone(String brand, String model, int storage) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Storage: " + storage + "GB";
    }
}


