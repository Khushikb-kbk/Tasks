package com.xworkz.thursday.internal;

public class Judges extends IndianIdol
{
    public void franchise(IndianIdol indianIdol){
        indianIdol.channel();
        if(indianIdol instanceof Judges){
            System.out.println("Is indian a judges");
            Judges judges = (Judges) indianIdol;
            judges.run();

            indianIdol.see();
            indianIdol.enjoy();
            indianIdol.respect();
            indianIdol.tradition();
            indianIdol.channel();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}


