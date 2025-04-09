package com.xworkz.wednesday.internal;

public class HairDryer
{
    private String brand;
    private int power;
    private boolean coolShot;

    public HairDryer(String brand, int power, boolean coolShot) {
        this.brand = brand;
        this.power = power;
        this.coolShot = coolShot;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Power: " + power + "W, Cool Shot: " + coolShot;
    }
}

