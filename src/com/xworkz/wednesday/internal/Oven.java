package com.xworkz.wednesday.internal;

public class Oven
{
    private String brand;
    private int power;
    private String type;

    public Oven(String brand, int power, String type){
        this.brand = brand;
        this.power= power;
        this.type = type;
    }

    @Override
    public String toString(){
        return "Brand :"+brand+" Power : "+power+" Type: "+type;
    }
}




