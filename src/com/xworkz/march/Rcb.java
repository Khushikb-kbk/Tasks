package com.xworkz.march;

public class Rcb {
    public void play(Match match){
        System.out.println("running play in Rcb");

        if (match!=null) {

        match.play();
        match.sit();

    }
        else {
        System.out.println("seems display is null, don't pass it wont work");

    }
}
    }








