package com.xworkz.thursday.internal;

public class Analog extends Video
{
    public void records(Video video){
        video.download();
        if(video instanceof Analog){
            System.out.println("Is video a analog");
            Analog analog = (Analog) video;
            analog.run();

           video.pause();
           video.play();
           video.resolution();
           video.rewind();
           video.download();

        }

    }
    public void run(){

        System.out.println("Running");

    }


}
