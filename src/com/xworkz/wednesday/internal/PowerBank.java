package com.xworkz.wednesday.internal;

public class PowerBank
{
    private String brand;
    private int capacity;
    private int outputPorts;

    public PowerBank(String brand, int capacity, int outputPorts) {
        this.brand = brand;
        this.capacity = capacity;
        this.outputPorts = outputPorts;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Capacity: " + capacity + "mAh, Output Ports: " + outputPorts;
    }
}

