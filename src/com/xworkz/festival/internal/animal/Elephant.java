package com.xworkz.festival.internal.animal;

public class Elephant extends Animal
{
    public void trumpet() {
        super.eat();
        super.sleep();
        super.move();
        super.breathe();
        super.makeSound();
        System.out.println("Elephant trumpeting");
    }
}

