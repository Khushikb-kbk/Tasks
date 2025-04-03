package com.xworkz.festival.internal.electronicdevice;

    public class SmartSpeaker extends ElectronicDevice {
        public void playMusic() {
            super.powerOn();
            super.powerOff();
            super.charge();
            super.updateSoftware();
            super.connectWifi();
            System.out.println("SmartSpeaker playing music");
        }
    }

