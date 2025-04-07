package com.xworkz.thursday.internal;

public class Truffle extends Chocolate
{
    public Truffle() {

        System.out.println("truffle");

    }
    @Override
    public  void kitkat() {
        System.out.println("calling a kitkat");
    }
   @Override
    public  void munch(){
        System.out.println("calling a munch");
    }
    @Override
    public  void chocobar(){
        System.out.println("calling a chocobar");
    }
    @Override
    public  void pulse(){
        System.out.println("calling a pulse");
    }
    @Override
    public  void perk(){
        System.out.println("calling a perk");
    }
}



