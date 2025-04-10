package com.xworkz.wednesday.internal;

public class Helicopter
{
    private String model;
    private int rotorBlades;
    private boolean militaryUse;

    public Helicopter(String model, int rotorBlades, boolean militaryUse) {
        this.model = model;
        this.rotorBlades = rotorBlades;
        this.militaryUse = militaryUse;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Rotor Blades: " + rotorBlades + ", Military Use: " + militaryUse;
    }
    @Override
    public int hashCode() {
        return 326;
    }
}


