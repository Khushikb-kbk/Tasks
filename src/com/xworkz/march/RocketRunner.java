package com.xworkz.march;

public class RocketRunner {
    public static void main(String[] args){
        Engine engine=new Engine();
        Rocket rocket=new Rocket();
        rocket.launch(engine);
    }
}

