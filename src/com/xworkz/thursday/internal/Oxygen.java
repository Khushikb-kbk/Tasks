package com.xworkz.thursday.internal;

public class Oxygen extends Hospital
{
    public Oxygen() {

        System.out.println("oxygen");

    }
   @Override
    public  void patient() {
        System.out.println("calling a patient");
    }
   @Override
    public void injection(){
        System.out.println("injection");
    }
    @Override
    public void drip(){
        System.out.println("injection");
    }
    @Override
    public  void doctor(){
        System.out.println("injection");
    }
    @Override
    public  void glucose(){
        System.out.println("injection");
    }



}






