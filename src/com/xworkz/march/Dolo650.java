package com.xworkz.march;

public class Dolo650
{
    public void syrup(Tablet tablet){
        System.out.println("running syrup in tablet");

        if (tablet!=null) {

            tablet.water();
            tablet.syrup();

        }
        else {
            System.out.println("seems display is null, don't pass it wont work");

        }
    }
}



