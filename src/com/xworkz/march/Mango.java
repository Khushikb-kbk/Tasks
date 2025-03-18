package com.xworkz.march;

public class Mango
{
    public void peel(Fruit fruit){
        System.out.println("running peel in fruit");

        if (fruit!=null) {

            fruit.color();
            fruit.peel();

        }
        else {
            System.out.println("seems display is null, don't pass it wont work");

        }
    }
}





