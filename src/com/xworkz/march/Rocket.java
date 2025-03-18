package com.xworkz.march;

public class Rocket
{
    public void launch(Engine engine){
        System.out.println("running oxygen in Space");

        if (engine!=null) {

            engine.launch();
            engine.flop();

        }
        else {
            System.out.println("seems display is null, don't pass it wont work");

        }
    }
}



