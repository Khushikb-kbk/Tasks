package com.xworkz.thursday.internal;

public class Beaded extends Ornaments
{
    public void accents(Ornaments ornaments){
        ornaments.diamond();
        if(ornaments instanceof Beaded){
            System.out.println("Is ornaments a beaded");
            Beaded beaded = (Beaded) ornaments;
            beaded.run();

            ornaments.gold();
            ornaments.diamond();
            ornaments.diamond();
            ornaments.silver();
            ornaments.artifical();

        }

    }
    public void run(){

        System.out.println("Running");

    }
}

