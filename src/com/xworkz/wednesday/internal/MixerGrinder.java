package com.xworkz.wednesday.internal;

public class MixerGrinder
{
    private String brand;
    private int jars;
    private int power;

    public MixerGrinder(String brand, int jars, int power) {
        this.brand = brand;
        this.jars = jars;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Jars: " + jars + ", Power: " + power + "W";
    }
}


