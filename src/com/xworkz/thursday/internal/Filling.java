package com.xworkz.thursday.internal;

public class Filling extends Truffle
{
    public void expresso(Truffle truffle){
        truffle.chocobar();
        if(truffle instanceof Filling){
            System.out.println("Is truffle a filling");
            Filling filling = (Filling) truffle;
            filling.run();

            truffle.kitkat();
            truffle.munch();
            truffle.chocobar();
            truffle.perk();
            truffle.pulse();

        }

    }
    public void run(){

        System.out.println("Running");

    }
}

