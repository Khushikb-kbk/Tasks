package com.xworkz.march;

public class Space
{
    public void oxygen(Atomsphere atomsphere){
        System.out.println("running oxygen in Space");

        if (atomsphere!=null) {

            atomsphere.nitrogen();
            atomsphere.oxygen();

        }
        else {
            System.out.println("seems display is null, don't pass it wont work");

        }
    }
}

