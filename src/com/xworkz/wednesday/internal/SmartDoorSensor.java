package com.xworkz.wednesday.internal;

public class SmartDoorSensor
{
    private String doorType;
    private boolean tamperAlert;
    private int batteryLife;

    public SmartDoorSensor(String doorType, boolean tamperAlert, int batteryLife) {
        this.doorType = doorType;
        this.tamperAlert = tamperAlert;
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return "Door: " + doorType + ", Tamper Alert: " + tamperAlert + ", Battery: " + batteryLife + " months";
    }
}


