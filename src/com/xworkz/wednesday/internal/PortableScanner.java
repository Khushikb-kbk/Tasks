package com.xworkz.wednesday.internal;

public class PortableScanner
{
    private String model;
    private int dpi;
    private boolean wireless;

    public PortableScanner(String model, int dpi, boolean wireless) {
        this.model = model;
        this.dpi = dpi;
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Resolution: " + dpi + " DPI, Wireless: " + wireless;
    }
    @Override
    public int hashCode() {
        return 510;
    }
}


