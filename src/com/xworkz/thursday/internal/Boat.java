package com.xworkz.thursday.internal;

public class Boat extends Watercraft
{
    public Boat() {

        System.out.println("boat");
    }

    @Override
    public void sail() {
        System.out.println("sail");
    }

    @Override
    public void anchor() {
        System.out.println("anchor");
    }

    @Override
    public void steer() {
        System.out.println("steer");
    }

    @Override
    public void dock() {
        System.out.println("dock");
    }

    @Override
    public void sink() {
        System.out.println("sink");



    }

}

