package com.xworkz.thursday.internal;

public class Virus extends Covid{
    public void corona(Covid covid){
        covid.collect();
        if(covid instanceof Virus){
            System.out.println("Is covid a virus");
            Virus virus = (Virus) covid;
            virus.run();

           covid.sample();
           covid.analyze();
           covid.collect();
           covid.injection();
           covid.precaution();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}

