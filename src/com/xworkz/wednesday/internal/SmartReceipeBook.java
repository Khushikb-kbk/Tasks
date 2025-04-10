package com.xworkz.wednesday.internal;

public class SmartReceipeBook
{
    private int recipeCount;
    private boolean voiceGuided;
    private String cuisineType;

    public SmartReceipeBook(int recipeCount, boolean voiceGuided, String cuisineType) {
        this.recipeCount = recipeCount;
        this.voiceGuided = voiceGuided;
        this.cuisineType = cuisineType;
    }

    @Override
    public String toString() {
        return "Recipes: " + recipeCount + ", Voice Guided: " + voiceGuided + ", Cuisine: " + cuisineType;
    }
    @Override
    public int hashCode() {
        return 730;
    }
}

