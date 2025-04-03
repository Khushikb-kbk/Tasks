package com.xworkz.festival.internal.vehicle;


    public class Submarine extends Vehicle {
        public void dive() {
            super.start();
            super.stop();
            super.accelerate();
            super.brake();
            super.honk();
            System.out.println("Submarine diving");
        }
    }

