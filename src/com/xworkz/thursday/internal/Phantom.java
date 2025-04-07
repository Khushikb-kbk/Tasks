package com.xworkz.thursday.internal;

public class Phantom extends RollsRoyce
{
    public void tufan(RollsRoyce rollsRoyce){
        rollsRoyce.prize();
        if(rollsRoyce instanceof Phantom){
            System.out.println("Is rollsroyce a phantom");
            Phantom phantom= (Phantom) rollsRoyce;
            phantom.run();

            rollsRoyce.model();
            rollsRoyce.prize();
            rollsRoyce.engine();
            rollsRoyce.gear();
            rollsRoyce.clutch();

        }

    }
    public void run(){

        System.out.println("Running");

    }
}

