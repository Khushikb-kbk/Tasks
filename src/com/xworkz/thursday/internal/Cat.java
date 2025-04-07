package com.xworkz.thursday.internal;

public class Cat extends Pet {
    public Cat() {

        System.out.println("cat");
    }

    @Override
    public void meow() {
        System.out.println("meow");
    }

    @Override
    public void purr() {
        System.out.println("purr");
    }

    @Override
    public void scratch() {
        System.out.println("scratch");
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }

    @Override
    public void play() {
        System.out.println("Play");


    }

}
