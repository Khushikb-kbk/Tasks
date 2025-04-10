package com.xworkz.wednesday.internal;

public class CeilingFan
{
    private String brand;
    private int speed;
    private boolean remoteControl;

    public CeilingFan(String brand, int speed, boolean remoteControl) {
        this.brand = brand;
        this.speed = speed;
        this.remoteControl = remoteControl;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Speed: " + speed + " RPM, Remote Control: " + remoteControl;
    }
    @Override
    public int hashCode() {
        return 162;
    }
}


