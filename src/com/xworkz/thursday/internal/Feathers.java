package com.xworkz.thursday.internal;

public class Feathers extends Ostrich
{
    public void count(Ostrich ostrich){
        ostrich.owls();


        if(ostrich instanceof Feathers){
            System.out.println("Is ostrich");
            Feathers feathers = (Feathers) ostrich;
            feathers.run();

            ostrich.owls();
            ostrich.crow();
            ostrich.duck();
            ostrich.parrot();
            ostrich.peacock();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}




