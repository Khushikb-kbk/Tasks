package com.xworkz.thursday.internal;

public class Steam extends Water
{
    public void vapour(Water water){
        water.pour();
        if(water instanceof Steam){
            System.out.println("Is water a vapours");
            Steam steam = (Steam) water;
            steam.run();

           water.pour();
           water.drink();
           water.wash();
           water.spill();
           water.juice();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}

