package com.xworkz.thursday.internal;

public class Eat extends Shark
{
    public void habitat(Shark shark){
        shark.eggs();


        if(shark instanceof Eat){
            System.out.println("Is eat ");
            Eat eat = (Eat) shark;
            eat.run();

            shark.swim();
            shark.hunt();
            shark.breathe_underwater();
            shark.detect_vibrations();
            shark.eggs();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}

