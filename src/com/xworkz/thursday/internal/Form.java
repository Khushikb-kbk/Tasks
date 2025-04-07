package com.xworkz.thursday.internal;

public class Form extends Variety
{
    public void sheet(Variety variety){
        variety.blue();


        if(variety instanceof Form){
            System.out.println("Is form");
            Form form = (Form) variety;
            form.run();

            variety.blue();
            variety.pink();
            variety.purple();
            variety.blue();
            variety.brown();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}



