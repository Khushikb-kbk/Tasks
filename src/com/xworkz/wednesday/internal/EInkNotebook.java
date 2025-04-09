package com.xworkz.wednesday.internal;

public class EInkNotebook
{
    private String model;
    private int pages;
    private boolean stylusSupport;

    public EInkNotebook(String model, int pages, boolean stylusSupport) {
        this.model = model;
        this.pages = pages;
        this.stylusSupport = stylusSupport;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Pages: " + pages + ", Stylus Support: " + stylusSupport;
    }
}


