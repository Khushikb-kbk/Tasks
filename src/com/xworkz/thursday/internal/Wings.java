package com.xworkz.thursday.internal;

public class Wings extends Dragon
{
    public void roar(Dragon dragon){
        dragon.riddle();
        if(dragon instanceof Wings){
            System.out.println("Is dragon a wings");
            Wings wings = (Wings) dragon;
            wings.run();

            dragon.shift();
            dragon.riddle();
            dragon.grant_wish();
            dragon.vanish();
            dragon.appear();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}
