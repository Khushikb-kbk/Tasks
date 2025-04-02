package com.xworkz.festival.internal.animal;

public class Bird extends Animal
{
    public void fly() {
        super.eat();
        super.sleep();
        super.move();
        super.breathe();
        super.makeSound();
        System.out.println("Bird flying");
    }
}

