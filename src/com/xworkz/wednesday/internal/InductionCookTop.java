package com.xworkz.wednesday.internal;

public class InductionCookTop
{

    private String brand;
    private int power;
    private int temperatureLevels;

public InductionCookTop(String brand, int power, int temperatureLevels) {
    this.brand = brand;
    this.power = power;
    this.temperatureLevels = temperatureLevels;
}

@Override
public String toString() {
    return "Brand: " + brand + ", Power: " + power + "W, Temperature Levels: " + temperatureLevels;
}
    @Override
    public int hashCode() {
        return 370;
    }
}
