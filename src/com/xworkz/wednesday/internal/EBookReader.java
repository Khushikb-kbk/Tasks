package com.xworkz.wednesday.internal;

public class EBookReader
{
    private String brand;
    private int storage;
    private boolean backlight;

    public EBookReader(String brand, int storage, boolean backlight) {
        this.brand = brand;
        this.storage = storage;
        this.backlight = backlight;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Storage: " + storage + "GB, Backlight: " + backlight;
    }
}


