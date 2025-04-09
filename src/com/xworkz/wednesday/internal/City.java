package com.xworkz.wednesday.internal;

public class City
{
    private String name;
    private int population;
    private String country;

    public City(String name, int population, String country){
        this.name = name;
        this.population = population;
        this.country = country;
    }

    @Override
    public String toString(){
        return "Name :"+name+" Population : "+population+" Country: "+country;
    }
}



