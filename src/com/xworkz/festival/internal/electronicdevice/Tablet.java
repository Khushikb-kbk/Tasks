package com.xworkz.festival.internal.electronicdevice;


    public class Tablet extends ElectronicDevice {
        public void draw() {
            super.powerOn();
            super.powerOff();
            super.charge();
            super.updateSoftware();
            super.connectWifi();
            System.out.println("Tablet drawing");
        }
    }


