package com.xworkz.wednesday.internal;

public class AirPurifyingMask
{
    private String brand;
    private boolean activeFiltration;
    private int usageHours;

    public AirPurifyingMask(String brand, boolean activeFiltration, int usageHours) {
        this.brand = brand;
        this.activeFiltration = activeFiltration;
        this.usageHours = usageHours;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Active Filtration: " + activeFiltration + ", Usage Hours: " + usageHours;
    }
}

