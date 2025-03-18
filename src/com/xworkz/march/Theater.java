package com.xworkz.march;

public class Theater {
    public void showInfo(Poster poster)
    {
        System.out.println("running show in Theater");

        if (poster!=null) {

            poster.showInfo();
            poster.chart();

        }
        else {
            System.out.println("seems display is null, don't pass it wont work");

        }
    }
    }






