package com.xworkz.thursday.internal;

public class Sea extends Dolphin
{
    public void exhale(Dolphin dolphin){
        dolphin.echolocate();


        if(dolphin instanceof Sea){
            System.out.println("Is breathe");
            Sea sea= (Sea) dolphin;
            sea.run();

            dolphin.jump();
            dolphin.breathe();
            dolphin.echolocate();
            dolphin.communicate();
            dolphin.swim();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}


