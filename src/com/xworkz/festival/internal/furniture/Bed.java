package com.xworkz.festival.internal.furniture;


    public class Bed extends Furniture {
        public void sleepOn() {
            super.assemble();
            super.disassemble();
            super.clean();
            super.move();
            super.repair();
            System.out.println("Bed sleeping on");
        }
    }

