package com.xworkz.thursday.internal;

public class Bicycle extends LandVehicle{

    public Bicycle() {
        System.out.println("bicycle");
    }
@Override
    public  void pedal() {

        System.out.println("pedal");
    }
@Override
    public  void brake() {
        System.out.println(" brake");
    }
@Override
    public void ring_bell() {

        System.out.println("ring_bell");
    }
@Override
    public  void balance() {
        System.out.println("balance");
    }
@Override
    public void wheel(){
        System.out.println("wheel");



    }

}


