package com.xworkz.thursday.internal;

public class Battery extends PowerBank
{
    public Battery() {

        System.out.println("identifying battery");

    }
    @Override
    public void oneplus() {
        System.out.println("calling a oneplus");
    }
    @Override
    public  void xiaomi(){
        System.out.println("calling a xiaomi");
    }
    @Override
    public  void apple(){
        System.out.println("calling a apple");
    }
    @Override
    public  void vivo(){
        System.out.println("calling a vivo");
    }
    @Override
    public  void oppo(){
        System.out.println("calling a oppo");
    }
}




