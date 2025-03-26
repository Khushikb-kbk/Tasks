package com.xworkz.Accessors;

public class Satellite
{
    private Orbit orbit;
    private double cost;
    private double weight;
    private double loadCapacity;


    public Orbit getOrbit() {
        return this.orbit;

    }

    public void setOrbit(Orbit orbit) {
        this.orbit = orbit;

    }


    public double getCost() {
        return this.cost;

    }


    public void setCost(double cost) {
        this.cost = cost;

    }


    public double getWeight() {
        return this.weight;

    }

    public void setWeight(double weight) {
        this.weight = weight;

    }


    public double getLoadCapacity() {
        return this.loadCapacity;

    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;

    }
}






