package com.xworkz.wednesday.internal;

public class
AirFryer
{
    private String brand;
    private double capacity;
    private boolean digitalDisplay;

    public AirFryer(String brand, double capacity, boolean digitalDisplay) {
        this.brand = brand;
        this.capacity = capacity;
        this.digitalDisplay = digitalDisplay;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Capacity: " + capacity + "L, Digital Display: " + digitalDisplay;
    }
}


