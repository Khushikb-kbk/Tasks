package com.xworkz.thursday.internal;

public class Surgeon extends Doctor
{
    public Surgeon() {
        System.out.println("surgeon");
    }
@Override
    public  void diagnose() {

        System.out.println("diagnose");
    }
@Override
    public  void medication() {
        System.out.println("medication");
    }
@Override
    public void sanitize() {

        System.out.println("sanitize");
    }
@Override
    public  void cotton() {
        System.out.println("cotton");
    }
@Override
    public void bandage(){
        System.out.println("bandage");



    }
}



