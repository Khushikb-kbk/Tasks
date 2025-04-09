package com.xworkz.wednesday.internal;

public class Mouse
{
    private String brand;
    private int dpi;
    private boolean wireless;

    public Mouse(String brand, int dpi, boolean wireless){
        this.brand = brand;
        this.dpi = dpi;
        this.wireless = wireless;
    }

    @Override
    public String toString(){
        return "Brand :"+brand+" Dpi : "+dpi+" Wireless: "+wireless;
    }
}




