package com.xworkz.thursday.internal;

public class Load extends Truck{
    public Load() {

        System.out.println("load");

    }
    @Override
    public  void semiTruck() {
        System.out.println("semiTruck");
    }
@Override
    public  void tanker(){
        System.out.println("tanker truck");
    }
    @Override
    public  void box(){
        System.out.println("box truck");
    }
    @Override
    public  void monster(){
        System.out.println("monster truck");
    }
    @Override
    public  void dump(){
        System.out.println("dump truck");
    }

}






