package com.xworkz.wednesday.internal;

public class Microwave
{
    private String brand;
    private int power;
    private boolean convection;

    public Microwave(String brand, int power, boolean convection) {
        this.brand = brand;
        this.power = power;
        this.convection = convection;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Power: " + power + "W, Convection: " + convection;
    }
}


