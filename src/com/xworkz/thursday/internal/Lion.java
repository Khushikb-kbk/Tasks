package com.xworkz.thursday.internal;

public class Lion extends Animal
{
    public Lion() {

        System.out.println("identifying lion");

    }
    @Override
    public  void move() {
        System.out.println("calling a eating");
    }
   @Override
    public  void eat(){
        System.out.println("calling eating ");
    }
    @Override
    public  void tear() {
        System.out.println("calling a tearing");
    }
    @Override
    public  void flesh() {
        System.out.println("calling a fleshing");
    }
    @Override
    public  void run() {
        System.out.println("calling a running");
    }

}




