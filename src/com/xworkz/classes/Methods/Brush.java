package com.xworkz.classes.Methods;
import java.awt.*;

public class Brush {
    Color color;
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
