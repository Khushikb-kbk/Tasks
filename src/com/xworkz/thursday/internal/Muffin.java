package com.xworkz.thursday.internal;

public class Muffin extends Pastry{
    public void tarts(Pastry pastry){
        pastry.decorate();
        if(pastry instanceof Muffin){
            System.out.println("Is pastry a muffin");
            Muffin muffin = (Muffin) pastry;
            muffin.run();

            pastry.bake();
            pastry.decorate();
            pastry.measure();
            pastry.measure();
            pastry.recipes();

        }

    }
    public void run(){

        System.out.println("Running");

    }
}

