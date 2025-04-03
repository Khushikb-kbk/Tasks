package com.xworkz.festival.internal.vehicle;


    public class Truck extends Vehicle {
        public void loadCargo() {
            super.start();
            super.stop();
            super.accelerate();
            super.brake();
            super.honk();
            System.out.println("Truck loading cargo");
        }
    }

