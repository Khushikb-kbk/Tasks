package com.xworkz.wednesday.internal;

public class VirtualPet
{
    private String name;
    private String species;
    private int happinessLevel;

    public VirtualPet(String name, String species, int happinessLevel) {
        this.name = name;
        this.species = species;
        this.happinessLevel = happinessLevel;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Species: " + species + ", Happiness Level: " + happinessLevel;
    }
    @Override
    public int hashCode() {
        return 900;
    }
}


