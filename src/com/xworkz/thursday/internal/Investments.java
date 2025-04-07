package com.xworkz.thursday.internal;

public class Investments extends Dell
{
    public void offer(Dell dell){
        dell.company();


        if(dell instanceof Investments){
            System.out.println("Is investment ");
            Investments investments = (Investments) dell;
            investments.run();

            dell.battery();
            dell.company();
            dell.memory();
            dell.apps();
            dell.storage();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}

