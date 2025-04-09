package com.xworkz.wednesday.internal;

public class HologramDisplay
{
    private String resolution;
    private boolean voiceControl;
    private double sizeInInches;

    public HologramDisplay(String resolution, boolean voiceControl, double sizeInInches) {
        this.resolution = resolution;
        this.voiceControl = voiceControl;
        this.sizeInInches = sizeInInches;
    }

    @Override
    public String toString() {
        return "Resolution: " + resolution + ", Voice Control: " + voiceControl + ", Size: " + sizeInInches + "\"";
    }
}

