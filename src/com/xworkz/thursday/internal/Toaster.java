package com.xworkz.thursday.internal;

public class Toaster extends Appliance{
    public Toaster() {

        System.out.println("identifying toaster");

    }
@Override
    public  void oven() {
        System.out.println("calling a oven");
    }
@Override
    public  void fridge(){
        System.out.println("fridge");
    }
@Override
    public  void washing(){
        System.out.println("washing");
    }
    @Override
    public  void straightener(){
        System.out.println("straightener");
    }
    @Override
    public  void dryer(){
        System.out.println("dryer");
    }



}





