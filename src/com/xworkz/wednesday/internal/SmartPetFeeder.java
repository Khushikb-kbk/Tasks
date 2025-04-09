package com.xworkz.wednesday.internal;

public class SmartPetFeeder
{
    private String petType;
    private int mealPortions;
    private boolean camera;

    public SmartPetFeeder(String petType, int mealPortions, boolean camera) {
        this.petType = petType;
        this.mealPortions = mealPortions;
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Pet Type: " + petType + ", Meal Portions: " + mealPortions + ", Camera: " + camera;
    }
}


