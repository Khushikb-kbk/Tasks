package com.xworkz.wednesday.internal;

public class Car
{
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString(){
        return "Make :"+make+" Model : "+model+" Year : "+year;
    }
    @Override
    public int hashCode() {
        return 150;
    }
}


