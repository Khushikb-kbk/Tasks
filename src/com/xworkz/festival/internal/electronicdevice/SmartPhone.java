package com.xworkz.festival.internal.electronicdevice;


    public class SmartPhone extends ElectronicDevice {
        public void makeCall() {
            super.powerOn();
            super.powerOff();
            super.charge();
            super.updateSoftware();
            super.connectWifi();
            System.out.println("Smartphone making call");
        }
    }

