package com.xworkz.festival.internal.electronicdevice;


    public class TV extends ElectronicDevice {
        public void changeChannel() {
            super.powerOn();
            super.powerOff();
            super.charge();
            super.updateSoftware();
            super.connectWifi();
            System.out.println("TV changing channel");
        }

    }
