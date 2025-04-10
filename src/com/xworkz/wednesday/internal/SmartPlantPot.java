package com.xworkz.wednesday.internal;

public class SmartPlantPot
{
    private String plantType;
    private boolean moistureSensor;
    private int waterLevel;

    public SmartPlantPot(String plantType, boolean moistureSensor, int waterLevel) {
        this.plantType = plantType;
        this.moistureSensor = moistureSensor;
        this.waterLevel = waterLevel;
    }

    @Override
    public String toString() {
        return "Plant Type: " + plantType + ", Moisture Sensor: " + moistureSensor + ", Water Level: " + waterLevel + "%";
    }
    @Override
    public int hashCode() {
        return 700;
    }
}



