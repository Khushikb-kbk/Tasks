package com.xworkz.wednesday.internal;

public class Truck
{
    private String brand;
    private int loadCapacity;
    private boolean fourWheelDrive;

    public Truck(String brand, int loadCapacity, boolean fourWheelDrive) {
        this.brand = brand;
        this.loadCapacity = loadCapacity;
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Load Capacity: " + loadCapacity + " kg, 4WD: " + fourWheelDrive;
    }
}


