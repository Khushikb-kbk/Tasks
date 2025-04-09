package com.xworkz.wednesday.internal;

public class Chair
{
    private String material;
    private int legs;
    private String color;

    public Chair(String material, int legs, String color){
        this.material = material;
        this.legs = legs;
        this.color = color;
    }

    @Override
    public String toString(){
        return "Material :"+material+" Legs : "+legs+" Color: "+color;
    }
}






