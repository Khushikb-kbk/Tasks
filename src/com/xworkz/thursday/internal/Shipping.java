package com.xworkz.thursday.internal;

public class Shipping extends Nykaa
{
    public void shopping(Nykaa nykaa){
        nykaa.quality();
        if(nykaa instanceof Shipping){
            System.out.println("Is nykaa a shipping");
            Shipping shipping= (Shipping) nykaa;
            shipping.run();

            nykaa.color();
            nykaa.brand();
            nykaa.quality();
            nykaa.jell();
            nykaa.matt();

        }

    }
    public void run(){

        System.out.println("Running");

    }
}


