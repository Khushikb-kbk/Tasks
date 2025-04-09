package com.xworkz.wednesday.internal;

public class HairStraightener
{
    private String brand;
    private int temperature;
    private boolean ceramicPlates;

    public HairStraightener(String brand, int temperature, boolean ceramicPlates) {
        this.brand = brand;
        this.temperature = temperature;
        this.ceramicPlates = ceramicPlates;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Temperature: " + temperature + "°C, Ceramic Plates: " + ceramicPlates;
    }
}

