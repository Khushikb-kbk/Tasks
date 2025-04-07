package com.xworkz.thursday.internal;

public class Coffee extends Beverage
{
    public Coffee() {
        System.out.println("beverage");
    }
@Override
    public  void pour () {

        System.out.println("pour");
    }
@Override
    public  void sip() {
        System.out.println("sip");
    }
@Override
    public void serve() {

        System.out.println("serve");
    }
@Override
    public  void ice() {
        System.out.println("ice");
    }
@Override
    public void stir() {
        System.out.println("stir");


    }
    }
