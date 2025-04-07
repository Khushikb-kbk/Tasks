package com.xworkz.thursday.internal;

public class Bonus extends Level
{
    public Bonus() {
        System.out.println("bonus");
    }
@Override
    public  void unlock() {

        System.out.println("unlock");
    }
@Override
    public  void load() {
        System.out.println("load");
    }
@Override
    public void trigger() {

        System.out.println("trigger");
    }
@Override
    public  void spawn() {
        System.out.println("spawn");
    }
@Override
    public void reward(){
        System.out.println("reward");




    }
}









