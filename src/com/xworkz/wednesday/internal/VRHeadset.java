package com.xworkz.wednesday.internal;

public class VRHeadset {
    private String brand;
    private boolean wireless;
    private int fieldOfView;

    public VRHeadset(String brand, boolean wireless, int fieldOfView) {
        this.brand = brand;
        this.wireless = wireless;
        this.fieldOfView = fieldOfView;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Wireless: " + wireless + ", Field of View: " + fieldOfView + "°";
    }
}


