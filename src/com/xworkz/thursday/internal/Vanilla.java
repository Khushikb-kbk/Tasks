package com.xworkz.thursday.internal;

public class Vanilla extends Cake{
    public void cherry(Cake cake){
        cake.prepare();
        if(cake instanceof Vanilla){
            System.out.println("Is cake a vanilla");
            Vanilla vanilla= (Vanilla) cake;
            vanilla.run();

            cake.decorate();
            cake.taste();
            cake.refrigerate();
            cake.serve();
            cake.prepare();

        }

    }
    public void run(){

        System.out.println("Running");

    }
}
