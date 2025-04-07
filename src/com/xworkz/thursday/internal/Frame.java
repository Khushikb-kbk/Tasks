package com.xworkz.thursday.internal;

public class Frame extends Shades{
    public void polarized(Shades shades){
        shades.lenskart();
        if(shades instanceof Frame){
            System.out.println("Is shades a frame");
            Frame frame = (Frame) shades;
            frame.run();

            shades.lenskart();
            shades.roybean();
            shades.gucci();
            shades.aviator();
            shades.mirror();

        }

    }
    public void run(){

        System.out.println("Running");

    }
}

