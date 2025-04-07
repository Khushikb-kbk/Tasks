package com.xworkz.thursday.internal;

public class Thickness extends Material{

    public Thickness() {

        System.out.println("identifying thickness");

    }
    @Override

    public  void plastic() {
        System.out.println("calling a plastic");
    }
    @Override
    public  void wood(){
        System.out.println("wood");
    }
    @Override
    public  void steel() {
        System.out.println("calling a steel");
    }
    @Override
    public  void brick() {
        System.out.println("calling a brick");
    }
    @Override
    public  void glass() {
        System.out.println("calling a glass");
    }

}




