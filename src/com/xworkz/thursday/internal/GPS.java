package com.xworkz.thursday.internal;

public class GPS extends Location

{
    public GPS() {
        System.out.println("GPS");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
@Override
    public  void coordinate() {

        System.out.println("coordinates");
    }
@Override
    public  void destination() {
        System.out.println("destination");
    }
@Override
    public void distance() {

        System.out.println("distance");
    }
@Override
    public  void position() {
        System.out.println("position");
    }

    public void display(){
        System.out.println("display");



    }
}






