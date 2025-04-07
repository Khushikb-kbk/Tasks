package com.xworkz.thursday.internal;

public class Painter extends Artist
{


public Painter() {

    System.out.println("painter");
}

@Override
public void sketch() {
    System.out.println("sketch");
}

@Override
public void mix_colors() {
    System.out.println("mix");
}

@Override
public void paint_canvas() {
    System.out.println("paint_canvas");
}

@Override
public void clean_brushes() {
    System.out.println("clean_brushes");
}

@Override
public void exhibit_work() {
    System.out.println("mix colors");


}

}


