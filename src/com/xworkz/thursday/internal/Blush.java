package com.xworkz.thursday.internal;

public class Blush extends Makeup
{
    public void foundation(Makeup makeup){
        makeup.mac();
        if(makeup instanceof Blush){
            System.out.println("Is makeup a blush");
            Blush blush= (Blush) makeup;
            blush.run();

            makeup.maybelline();
            makeup.mac();
            makeup.mars();
            makeup.lakme();
            makeup.facescanada();

        }

    }
    public void run(){

        System.out.println("Running");

    }
}

