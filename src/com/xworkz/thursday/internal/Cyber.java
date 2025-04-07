package com.xworkz.thursday.internal;

public class Cyber extends Lawyer
{
    public Cyber() {
        System.out.println("lawyer");
    }
@Override
    public  void draft() {

        System.out.println("draft");
    }
@Override
    public  void enact() {
        System.out.println("enact");
    }
@Override
    public void enforce() {

        System.out.println("enforce");
    }
@Override
    public  void amend() {
        System.out.println("amend");
    }
@Override
    public void repeal(){
        System.out.println("repeal");



    }
}



