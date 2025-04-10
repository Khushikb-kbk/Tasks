package com.xworkz.wednesday.internal;

public class SmartDeskLamp
{
    private String lightColor;
    private int brightnessLevel;
    private boolean motionSensor;

    public SmartDeskLamp(String lightColor, int brightnessLevel, boolean motionSensor) {
        this.lightColor = lightColor;
        this.brightnessLevel = brightnessLevel;
        this.motionSensor = motionSensor;
    }

    @Override
    public String toString() {
        return "Light Color: " + lightColor + ", Brightness: " + brightnessLevel + ", Motion Sensor: " + motionSensor;
    }
    @Override
    public int hashCode() {
        return 590;
    }
}


