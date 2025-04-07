package com.xworkz.thursday.internal;

public class Video extends Content
{
    public Video() {
        System.out.println("video");
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
    public void rewind() {

        System.out.println("rewind");
    }
@Override
    public  void download() {
        System.out.println("download");
    }
@Override
    public void resolution(){
        System.out.println("resolution");



    }
}



