package com.xworkz.festival.internal.electronicdevice;

public class Camera extends ElectronicDevice
{
    public void takePhoto() {
        super.powerOn();
        super.powerOff();
        super.charge();
        super.updateSoftware();
        super.connectWifi();
        System.out.println("Camera taking photo");
    }
}