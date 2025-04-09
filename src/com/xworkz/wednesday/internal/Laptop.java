package com.xworkz.wednesday.internal;

public class Laptop
{
    private String brand;
    private String processor;
    private int ram;

    public Laptop(String brand, String processor, int ram){
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
    }

    @Override
    public String toString(){
        return "Brand :"+brand+" Processor : "+processor+" Ram : "+ram;
    }
}





