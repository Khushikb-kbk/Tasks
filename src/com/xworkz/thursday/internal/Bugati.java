package com.xworkz.thursday.internal;

public class Bugati extends Bike
{
    public Bugati() {

        System.out.println("identifying bugati");

    }
    @Override
    public  void engine() {
        System.out.println("calling a engine");
    }
   @Override
    public  void speed(){
        System.out.println("speed");
    }
    @Override
    public  void saddle(){
        System.out.println("saddle");
    }
    @Override
    public  void brakes(){
        System.out.println("brakes");
    }
    @Override
    public  void frame(){
        System.out.println("frame");
    }
}





