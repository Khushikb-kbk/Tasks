package com.xworkz.thursday.internal;

public class Background extends Sound
{
    public Background() {
        System.out.println("sound");
    }
@Override
    public  void play() {

        System.out.println("play");
    }
@Override
    public  void pause() {
        System.out.println("pause");
    }
@Override
    public void loop() {

        System.out.println("loop");
    }
@Override
    public  void track() {
        System.out.println("track");
    }
@Override
    public void volume(){
        System.out.println("volume");



    }
}









