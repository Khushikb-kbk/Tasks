package com.xworkz.thursday.internal;

public class Ball extends Round
{
    public void sphere(Round round){
        round.circle();
        if(round instanceof Ball){
            System.out.println("Is round a ball");
            Ball ball= (Ball) round;
            ball.run();

            round.rectangle();
            round.square();
            round.oval();
            round.triangle();
            round.circle();

        }

    }
    public void run(){

        System.out.println("Running");

    }
}


