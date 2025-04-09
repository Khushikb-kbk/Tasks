package com.xworkz.wednesday.internal;

public class SmartCoaster
{
    private boolean temperatureDetection;
    private String material;
    private boolean ledIndicator;

    public SmartCoaster(boolean temperatureDetection, String material, boolean ledIndicator) {
        this.temperatureDetection = temperatureDetection;
        this.material = material;
        this.ledIndicator = ledIndicator;
    }

    @Override
    public String toString() {
        return "Temp Detection: " + temperatureDetection + ", Material: " + material + ", LED Indicator: " + ledIndicator;
    }
}


