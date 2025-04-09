package com.xworkz.wednesday.internal;

public class
SmartMugWarmer
{
    private int maxTemperature;
    private boolean autoShutoff;
    private String color;

    public SmartMugWarmer(int maxTemperature, boolean autoShutoff, String color) {
        this.maxTemperature = maxTemperature;
        this.autoShutoff = autoShutoff;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Max Temp: " + maxTemperature + "°C, Auto Shutoff: " + autoShutoff + ", Color: " + color;
    }
}

