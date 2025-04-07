package com.xworkz.thursday.internal;

public class Equipment extends Samsung
{
    public void telecom(Samsung samsung){
        samsung.storage();
        if(samsung instanceof Equipment){
            System.out.println("Is samsung a equipment");
            Equipment equipment = (Equipment) samsung;
            equipment.run();

            samsung.storage();
            samsung.battery();
            samsung.apps();
            samsung.memory();
            samsung.charge();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}


