package com.xworkz.thursday.internal;

public class Elaichi extends Masala
{
    public void spices(Masala masala){
        masala.spicy();
        if(masala instanceof Elaichi){
            System.out.println("Is masala a elaichi");
            Elaichi elaichi= (Elaichi) masala;
            elaichi.run();

            masala.spicy();
            masala.spicy();
            masala.veggies();
            masala.flavour();
            masala.colour();

        }

    }
    public void run(){

        System.out.println("Running");

    }
}

