package com.xworkz.wednesday.internal;

public class SandwichMaker
{
    private String brand;
    private int sliceCapacity;
    private boolean grillFunction;

    public SandwichMaker(String brand, int sliceCapacity, boolean grillFunction) {
        this.brand = brand;
        this.sliceCapacity = sliceCapacity;
        this.grillFunction = grillFunction;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Slice Capacity: " + sliceCapacity + ", Grill Function: " + grillFunction;
    }
}

