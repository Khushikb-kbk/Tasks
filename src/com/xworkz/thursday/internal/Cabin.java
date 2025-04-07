package com.xworkz.thursday.internal;

public class Cabin extends Elevator
{
    public void weight(Elevator elevator){
        elevator.floor();
        if(elevator instanceof Cabin){
            System.out.println("Is elevator a cabin");
            Cabin cabin = (Cabin) elevator;
            cabin.run();

           elevator.close();
           elevator.emergency();
           elevator.floor();
           elevator.open();
           elevator.emergency();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}


