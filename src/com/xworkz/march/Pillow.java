package com.xworkz.march;

public class Pillow
{
    public void hard(Sleep sleep){
        System.out.println("running hard in sleep");

        if (sleep!=null) {

            sleep.soft();
            sleep.hard();

        }
        else {
            System.out.println("seems display is null, don't pass it wont work");

        }
    }
}




