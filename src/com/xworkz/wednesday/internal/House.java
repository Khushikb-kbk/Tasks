package com.xworkz.wednesday.internal;

public class House
{
    private String address;
    private int bathrooms;
    private int bedrooms;

    public House(String address, int bathrooms, int bedrooms){
        this.address = address;
        this.bathrooms = bathrooms;
        this.bedrooms = bedrooms;
    }

    @Override
    public String toString(){
        return "Address :"+address+" Bathrooms : "+bathrooms+" Bedrooms: "+bedrooms;
    }
}




