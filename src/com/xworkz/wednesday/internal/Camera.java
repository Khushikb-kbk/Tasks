package com.xworkz.wednesday.internal;

public class Camera
{
    private String brand;
    private int megapixels;
    private boolean mirrorless;

    public Camera(String brand, int megapixels, boolean mirrorless) {
        this.brand = brand;
        this.megapixels = megapixels;
        this.mirrorless = mirrorless;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Megapixels: " + megapixels + ", Mirrorless: " + mirrorless;
    }
}


