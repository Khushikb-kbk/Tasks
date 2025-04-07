package com.xworkz.thursday.internal;

public class Weather extends Atomsphere
{

    public Weather() {

        System.out.println("weather");

    }
    @Override
    public  void waterVapour() {
        System.out.println("calling a vapour");
    }
   @Override
    public  void gas(){
        System.out.println("gas");
    }
    @Override
    public  void argon(){
        System.out.println("argon");
    }
    @Override
    public  void carbon(){
        System.out.println("carbon");
    }
    @Override
    public  void exosphere(){
        System.out.println("exosphere");
    }
}




