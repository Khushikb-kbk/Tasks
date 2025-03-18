package com.xworkz.march;

public class Barber
{
    public void cut(Haircut haircut){
        System.out.println("running cut in haircut");

        if (haircut!=null) {

            haircut.comb();
            haircut.cut();

        }
        else {
            System.out.println("seems display is null, don't pass it wont work");

        }
    }
}





