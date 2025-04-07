package com.xworkz.thursday.internal;

public class Ambulance extends Emergency
{
    public Ambulance() {
        System.out.println("emergency");
    }
@Override
    public  void patient() {

        System.out.println("patient");
    }
@Override
    public  void alert() {
        System.out.println("alert");
    }
@Override
    public void respond_calls() {

        System.out.println("respond calls");
    }
@Override
    public  void navigate_traffic() {
        System.out.println("navigate traffic");
    }
@Override
    public void sirens(){
        System.out.println("sirens");



    }
}


