package com.xworkz.thursday.internal;

public class Mirchi extends Shamnur
{
    public void chilli(Shamnur shamnur){
        shamnur.distance();
        if(shamnur instanceof Mirchi){
            System.out.println("Is shamnur a mirchi");
            Mirchi mirchi= (Mirchi) shamnur;
            mirchi.run();

           shamnur.distance();
           shamnur.members();
           shamnur.festival();
           shamnur.shops();
           shamnur.house();

        }

    }
    public void run(){

        System.out.println("Running");

    }
}

