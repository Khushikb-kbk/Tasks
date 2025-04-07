package com.xworkz.thursday.internal;

public class Entities extends FuseFlick
{
    public void terminology(FuseFlick fuseFlick){
        fuseFlick.shock();
        if(fuseFlick instanceof Entities){
            System.out.println("Is fuse a entities");
            Entities entities= (Entities) fuseFlick;
            entities.run();

            fuseFlick.shock();
            fuseFlick.shop();
            fuseFlick.current();
            fuseFlick.damage();
            fuseFlick.danger();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}


