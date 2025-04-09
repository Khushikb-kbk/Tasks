package com.xworkz.wednesday.internal;

public class Airplane
{
    private String model;
    private int capacity;
    private String airline;

    public Airplane(String model, int capacity, String airline){
        this.model = model;
        this.capacity = capacity;
        this.airline = airline;
    }

    @Override
    public String toString(){
        return "Model :"+model+" Capacity : "+capacity+" Airline : "+airline;
    }
}




