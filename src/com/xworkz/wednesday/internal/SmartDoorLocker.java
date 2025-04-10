package com.xworkz.wednesday.internal;

public class SmartDoorLocker
{
    private String brand;
    private boolean fingerprintAccess;
    private boolean appControl;

    public SmartDoorLocker(String brand, boolean fingerprintAccess, boolean appControl) {
        this.brand = brand;
        this.fingerprintAccess = fingerprintAccess;
        this.appControl = appControl;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Fingerprint Access: " + fingerprintAccess + ", App Control: " + appControl;
    }
    @Override
    public int hashCode() {
        return 600;
    }
}


