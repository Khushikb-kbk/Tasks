package com.xworkz.thursday.internal;

public class Rock extends Climbing
{
    public void bouldering(Climbing climbing){
        climbing.erosion();
        if(climbing instanceof Rock){
            System.out.println("Is climbing a rock");
            Rock rock = (Rock) climbing;
            rock.run();

            climbing.erosion();
            climbing.volcano();
            climbing.residual();
            climbing.block();
            climbing.peak();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}

