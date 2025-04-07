package com.xworkz.thursday;

import com.xworkz.thursday.internal.Game;

public class Puzzle extends Game
{
    public Puzzle() {
        System.out.println("puzzle");
    }
@Override
    public  void start() {

        System.out.println("start");
    }

@Override
    public  void end() {
        System.out.println("end");
    }
@Override
    public void save() {

        System.out.println("save");
    }
@Override
    public  void load() {
        System.out.println("load");
    }
@Override
    public void pause(){
        System.out.println("pause");



    }
}





