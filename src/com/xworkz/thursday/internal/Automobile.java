package com.xworkz.thursday.internal;

public class Automobile extends Bugati
{
    public void innovations(Bugati bugati){
        bugati.brakes();
        if(bugati instanceof Automobile){
            System.out.println("Is bugati a automobile");
            Automobile automobile = (Automobile) bugati;
            automobile.run();

           bugati.speed();
           bugati.brakes();
           bugati.frame();
           bugati.engine();
           bugati.saddle();

        }

    }
    public void run(){

        System.out.println("Running");

    }


}

