package com.xworkz.festival.internal.vehicle;

    public class MotorCycle extends Vehicle {
        public void wheelie() {
            super.start();
            super.stop();
            super.accelerate();
            super.brake();
            super.honk();
            System.out.println("Motorcycle doing wheelie");
        }
    }

