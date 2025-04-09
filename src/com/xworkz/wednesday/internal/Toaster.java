package com.xworkz.wednesday.internal;

public class Toaster
{
    private String brand;
    private int sliceCapacity;
    private boolean defrostOption;

    public Toaster(String brand, int sliceCapacity, boolean defrostOption) {
        this.brand = brand;
        this.sliceCapacity = sliceCapacity;
        this.defrostOption = defrostOption;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Slice Capacity: " + sliceCapacity + ", Defrost Option: " + defrostOption;
    }
}


