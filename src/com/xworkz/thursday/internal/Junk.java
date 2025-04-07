package com.xworkz.thursday.internal;

public class Junk extends Gobi
{
    public void capsicum(Gobi gobi){
        gobi.momos();


        if(gobi instanceof Junk){
            System.out.println("Is junk");
            Junk junk= (Junk) gobi;
            junk.run();

            gobi.momos();
            gobi.vadapav();
            gobi.burger();
            gobi.pizza();
            gobi.panipuri();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}

