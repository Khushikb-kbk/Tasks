package com.xworkz.festival.internal.electronicdevice;

public class Router extends ElectronicDevice {
        public void broadcastSignal() {
            super.powerOn();
            super.powerOff();
            super.charge();
            super.updateSoftware();
            super.connectWifi();
            System.out.println("Router broadcasting signal");
        }
    }

