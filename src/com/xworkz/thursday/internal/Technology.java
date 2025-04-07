package com.xworkz.thursday.internal;

public class Technology extends Online
{
    public void learn(Online online){
        online.certificate();


        if(online instanceof Technology){
            System.out.println("Is online");
            Technology technology= (Technology) online;
            technology.run();

            online.certificate();
            online.forum();
            online.track();
            online.assign();
            online.enroll();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}




