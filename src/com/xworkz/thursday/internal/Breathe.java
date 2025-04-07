package com.xworkz.thursday.internal;

public class Breathe extends Oxygen
{
    public void inhale(Oxygen oxygen){
        oxygen.drip();


        if(oxygen instanceof Breathe){
            System.out.println("Is breathe");
            Breathe breathe= (Breathe) oxygen;
            breathe.run();

            oxygen.drip();
            oxygen.doctor();
            oxygen.injection();
            oxygen.patient();
            oxygen.glucose();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}


