package com.xworkz.thursday.internal;

public class Chopper extends Items
{
    public void cut(Items items){
        items.clothing();


        if(items instanceof Chopper){
            System.out.println("Is chopper ");
            Chopper chopper = (Chopper) items;
            chopper.run();

            items.clothing();
            items.grocery();
            items.textiles();
            items.socks();
            items.granite();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}

