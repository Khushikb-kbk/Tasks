package com.xworkz.thursday.internal;

public class Jupiter extends GasGiant
{
    public void saturn(GasGiant gasGiant){
        gasGiant.rotate();
        if(gasGiant instanceof Jupiter){
            System.out.println("Is gasgiant a jupiter");
            Jupiter jupiter = (Jupiter) gasGiant;
            jupiter.run();

            gasGiant.orbit();
            gasGiant.support();
            gasGiant.rotate();
            gasGiant.reflect();
            gasGiant.emit();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}

