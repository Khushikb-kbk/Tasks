package com.xworkz.thursday.internal;

public class Authority extends Presidential
{
    public void term(Presidential presidential){
        presidential.manage();
        if(presidential instanceof Authority){
            System.out.println("Is presidential a authority");
            Authority authority = (Authority) presidential;
            authority.run();

            presidential.manage();
            presidential.count();
            presidential.organize();
            presidential.debate();
            presidential.register();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}


