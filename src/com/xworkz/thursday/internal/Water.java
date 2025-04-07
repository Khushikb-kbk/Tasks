package com.xworkz.thursday.internal;

public class Water extends Liquid

{
    public Water(){
        System.out.println("running liquid in water");
    }
    @Override
    public void drink(){
        System.out.println("Drink Liquid");
    }
    @Override
    public void pour(){
        System.out.println("pour the liquid");
    }
    @Override
    public void spill(){
        System.out.println("spill the liquid");
    }
    @Override
    public void wash(){
        System.out.println("wash the liquid");
    }
    @Override
    public void juice(){
        System.out.println("juice the liquid");
    }
}


