package com.xworkz.thursday.internal;

public class Red extends Tomato
{
    public void edible(Tomato tomato){
        tomato.fibres();
        if(tomato instanceof Red){
            System.out.println("Is tomato a red");
            Red red = (Red) tomato;
            red.run();

            tomato.minerals();
            tomato.potassium();
            tomato.iron();
            tomato.fibres();
            tomato.folate();

        }

    }
    public void run(){

        System.out.println("Running");

    }
}

