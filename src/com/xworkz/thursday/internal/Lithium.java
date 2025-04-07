package com.xworkz.thursday.internal;

public class Lithium extends Chemistry
{
    public void atoms(Chemistry chemistry){
        chemistry.reaction();
        if(chemistry instanceof Lithium){
            System.out.println("Is chemistry a lithium");
            Lithium lithium = (Lithium) chemistry;
            lithium.run();

            chemistry.reaction();
            chemistry.record();
            chemistry.protection();
            chemistry.waste();
            chemistry.chemicals();

        }

    }
    public void run(){

        System.out.println("Running");

    }
}



