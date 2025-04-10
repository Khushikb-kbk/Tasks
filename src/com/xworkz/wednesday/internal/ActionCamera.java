package com.xworkz.wednesday.internal;

public class ActionCamera
{
    private String brand;
    private boolean waterproof;
    private int resolution;

    public ActionCamera(String brand, boolean waterproof, int resolution) {
        this.brand = brand;
        this.waterproof = waterproof;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Waterproof: " + waterproof + ", Resolution: " + resolution + "p";
    }

    @Override
    public int hashCode() {
        return 20;
    }
}


