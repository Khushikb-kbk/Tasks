package com.xworkz.thursday.internal;

public class Handwriting extends Write
{
    public void neat(Write write){
        write.bright();


        if(write instanceof Handwriting){
            System.out.println("Is write");
            Handwriting handwriting = (Handwriting) write;
            handwriting.run();

            write.flair();
            write.writometer();
            write.bright();
            write.parker();
            write.pentonic();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}


