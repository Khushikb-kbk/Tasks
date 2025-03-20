package com.xworkz.classes;

public class Brush {
    com.xworkz.classes.Color color;
    Brush(Color color){
        this.color = color;
    }
    void clean(){
        System.out.println("Running Clean  in Brush");
    }
    void scrub(){
        System.out.println("Running Scrub in Brush");
    }
}

