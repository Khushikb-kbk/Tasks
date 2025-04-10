package com.xworkz.wednesday.internal;

public class CoffeeMachine
{
    private String brand;
    private int cupCapacity;
    private boolean milkFrother;

    public CoffeeMachine(String brand, int cupCapacity, boolean milkFrother) {
        this.brand = brand;
        this.cupCapacity = cupCapacity;
        this.milkFrother = milkFrother;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Cup Capacity: " + cupCapacity + ", Milk Frother: " + milkFrother;
    }
    @Override
    public int hashCode() {
        return 178;
    }
}


