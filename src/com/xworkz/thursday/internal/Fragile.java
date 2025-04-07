package com.xworkz.thursday.internal;

public class Fragile  extends Load
{
    public void weight(Load load){
        load.tanker();
        if(load instanceof Fragile){
            System.out.println("Is load a fragile");
            Fragile fragile = (Fragile) load;
            fragile.run();

            load.semiTruck();
            load.tanker();
            load.box();
            load.monster();
            load.dump();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}

