package com.xworkz.thursday.internal;

public class Ride extends Bicycle
{
    public void bell(Bicycle bicycle){
        bicycle.pedal();
        if(bicycle instanceof Ride){
            System.out.println("Is bicycle a ride");
            Ride ride= (Ride) bicycle;
            ride.run();

            bicycle.pedal();
            bicycle.brake();
            bicycle.ring_bell();
            bicycle.balance();
            bicycle.wheel();

        }

    }
    public void run(){

        System.out.println("Running");

    }
}


