package com.xworkz.festival.internal.vehicle;


    public class Bus extends Vehicle {
        public void openDoors() {
            super.start();
            super.stop();
            super.accelerate();
            super.brake();
            super.honk();
            System.out.println("Bus opening doors");
        }
    }

