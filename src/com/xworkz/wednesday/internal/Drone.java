package com.xworkz.wednesday.internal;

public class Drone
{
    private String model;
    private double range;
    private boolean camera;

    public Drone(String model, double range, boolean camera) {
        this.model = model;
        this.range = range;
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Range: " + range + " km, Camera: " + camera;
    }

}
