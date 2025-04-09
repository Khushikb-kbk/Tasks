package com.xworkz.wednesday.internal;

public class Headphones
{
    private String brand;
    private boolean noiseCancelling;
    private String type;

    public Headphones(String brand, boolean noiseCancelling, String type) {
        this.brand = brand;
        this.noiseCancelling = noiseCancelling;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Noise Cancelling: " + noiseCancelling + ", Type: " + type;
    }
}

