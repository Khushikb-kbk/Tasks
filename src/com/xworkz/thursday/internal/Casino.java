package com.xworkz.thursday.internal;

public class Casino extends Boat
{
    public void ship(Boat boat){
        boat.sink();


        if(boat instanceof Casino){
            System.out.println("Is boat");
            Casino casino= (Casino) boat;
            casino.run();

            boat.sink();
            boat.sail();
            boat.anchor();
            boat.steer();
            boat.dock();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}


