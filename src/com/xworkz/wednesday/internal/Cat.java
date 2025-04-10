package com.xworkz.wednesday.internal;

public class Cat
{
    private String breed;
    private String color;
    private int age;

    public Cat(String breed, String color, int age){
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Breed :"+breed+" Color : "+color+" Age : "+age;
    }
    @Override
    public int hashCode() {
        return 156;
    }
}




