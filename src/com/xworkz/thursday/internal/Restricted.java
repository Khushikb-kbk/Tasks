package com.xworkz.thursday.internal;

public class Restricted extends Area
{
    public Restricted() {
        System.out.println("restricted");
    }
@Override
    public  void access() {

        System.out.println("access");
    }
@Override
    public  void entry() {
        System.out.println("entry");
    }
@Override
    public void visit() {

        System.out.println("visit");
    }
@Override
    public  void clearance() {
        System.out.println("clearance");
    }
@Override
    public void alarm(){
        System.out.println("alarm");



    }
}









