package com.xworkz.wednesday.internal;

public class Webcam
{
    private String brand;
    private int resolution;
    private boolean microphone;

    public Webcam(String brand, int resolution, boolean microphone) {
        this.brand = brand;
        this.resolution = resolution;
        this.microphone = microphone;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Resolution: " + resolution + "p, Microphone: " + microphone;
    }
}

