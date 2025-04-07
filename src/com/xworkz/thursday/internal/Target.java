package com.xworkz.thursday.internal;

public class Target extends Bonus
{
    public void tax(Bonus bonus){
        bonus.trigger();
        if(bonus instanceof Target){
            System.out.println("Is bonus a target");
            Target target = (Target) bonus;
            target.run();

            bonus.load();
            bonus.trigger();
            bonus.spawn();
            bonus.unlock();
            bonus.reward();

        }

    }
    public void run(){

        System.out.println("Running");

    }


}


