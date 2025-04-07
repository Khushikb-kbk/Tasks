package com.xworkz.thursday.internal;

public class Jesus  extends Christmas{
    public void christian(Christmas christmas){
        christmas.gifts();
        if(christmas instanceof Jesus){
            System.out.println("Is christmas a jesus");
            Jesus jesus = (Jesus) christmas;
            jesus.run();

            christmas.gifts();
            christmas.decorate();
            christmas.food();
            christmas.celebrate();
            christmas.rituals();

        }

    }
    public void run(){

        System.out.println("Running");

    }
}

