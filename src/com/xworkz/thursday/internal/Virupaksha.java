package com.xworkz.thursday.internal;

public class Virupaksha extends Hampi
{
    public void pujar(Hampi hampi){
        hampi.build();


        if(hampi instanceof Virupaksha){
            System.out.println("Is hampi");
            Virupaksha virupaksha= (Virupaksha) hampi;
            virupaksha.run();

            hampi.build();
            hampi.destroy();
            hampi.construct();
            hampi.famous();
            hampi.people();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}



