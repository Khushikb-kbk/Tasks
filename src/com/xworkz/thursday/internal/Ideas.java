package com.xworkz.thursday.internal;

public class Ideas extends Poetry
{
    public void stories(Poetry poetry){
        poetry.publish();


        if(poetry instanceof Ideas){
            System.out.println("Is poetry ");
            Ideas ideas = (Ideas) poetry;
            ideas.run();

            poetry.rhyme();
            poetry.express();
            poetry.rhyme();
            poetry.draft();
            poetry.publish();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}





