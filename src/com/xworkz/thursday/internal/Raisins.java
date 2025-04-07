package com.xworkz.thursday.internal;

public class Raisins extends MixFruit
{
    public void calories(MixFruit mixFruit){
        mixFruit.orange();
        if(mixFruit instanceof Raisins){
            System.out.println("Is mixfruit a raisins");
            Raisins raisins = (Raisins) mixFruit;
            raisins.run();

            mixFruit.orange();
            mixFruit.apple();
            mixFruit.pineapple();
            mixFruit.apple();
            mixFruit.grapes();

        }

    }
    public void run(){

        System.out.println("Running");

    }
}



