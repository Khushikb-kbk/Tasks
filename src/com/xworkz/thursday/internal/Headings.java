package com.xworkz.thursday.internal;

public class Headings extends Read
{
    public void bold(Read read){
        read.jantavani();


        if(read instanceof Headings){
            System.out.println("Is read");
            Headings headings= (Headings) read;
            headings.run();

           read.jantavani();
           read.prajavani();
           read.vijaykarnataka();
           read.deccanHerold();
           read.hindustan();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}





