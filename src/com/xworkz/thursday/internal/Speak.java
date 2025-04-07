package com.xworkz.thursday.internal;

public class Speak extends Language
{
    public Speak() {
        System.out.println("identifying speak");

    }
    @Override
    public  void english() {
        System.out.println("calling a english");
    }
    @Override
    public  void hindi(){
        System.out.println("calling hindi");
    }
    @Override
    public  void marati(){
        System.out.println("calling marati");
    }
    @Override
    public  void konkani(){
        System.out.println("calling konkani");
    }
    @Override
    public  void telgu(){
        System.out.println("calling telgu");
    }
}




