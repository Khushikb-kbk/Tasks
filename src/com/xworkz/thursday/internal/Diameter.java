package com.xworkz.thursday.internal;

public class Diameter extends Wheels
{
    public void load(Wheels wheels){
        wheels.auto();
        if(wheels instanceof Diameter){
            System.out.println("Is wheels a diameter");
            Diameter diameter = (Diameter) wheels;
            diameter.run();

            wheels.tractor();
            wheels.auto();
            wheels.twoWheeler();
            wheels.fourWheeler();
            wheels.bus();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}

