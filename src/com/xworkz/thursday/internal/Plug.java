package com.xworkz.thursday.internal;

public class Plug extends Vaccum
{
    public Plug() {

        System.out.println("identifying plug");

    }
   @Override
    public  void turnOn() {
        System.out.println("turn on");
    }
   @Override
    public  void turnOf(){
        System.out.println("turn of ");
    }
    @Override
    public  void dyson() {
        System.out.println("dyson");
    }
    @Override
    public  void shark() {
        System.out.println("shark");
    }
    @Override
    public  void wire() {
        System.out.println("wire");
    }


}




