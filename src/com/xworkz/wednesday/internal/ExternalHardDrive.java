package com.xworkz.wednesday.internal;

public class ExternalHardDrive
{
    private String brand;
    private int capacity;
    private String connection;

    public ExternalHardDrive(String brand, int capacity, String connection) {
        this.brand = brand;
        this.capacity = capacity;
        this.connection = connection;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Capacity: " + capacity + "GB, Connection: " + connection;
    }
}


