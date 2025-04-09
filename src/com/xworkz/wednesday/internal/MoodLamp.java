package com.xworkz.wednesday.internal;

public class MoodLamp
{
    private String lightColor;
    private int brightnessLevel;
    private boolean musicSync;

    public MoodLamp(String lightColor, int brightnessLevel, boolean musicSync) {
        this.lightColor = lightColor;
        this.brightnessLevel = brightnessLevel;
        this.musicSync = musicSync;
    }

    @Override
    public String toString() {
        return "Color: " + lightColor + ", Brightness: " + brightnessLevel + ", Music Sync: " + musicSync;
    }

}

