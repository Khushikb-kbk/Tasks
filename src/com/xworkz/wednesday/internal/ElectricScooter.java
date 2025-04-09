package com.xworkz.wednesday.internal;

public class ElectricScooter
{
    private String model;
    private int topSpeed;
    private int range;

    public ElectricScooter(String model, int topSpeed, int range) {
        this.model = model;
        this.topSpeed = topSpeed;
        this.range = range;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Top Speed: " + topSpeed + " km/h, Range: " + range + " km";
    }
}


