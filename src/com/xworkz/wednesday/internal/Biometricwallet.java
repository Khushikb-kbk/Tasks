package com.xworkz.wednesday.internal;

public class Biometricwallet
{
    private String color;
    private boolean fingerprintLock;
    private int cardCapacity;

    public Biometricwallet(String color, boolean fingerprintLock, int cardCapacity) {
        this.color = color;
        this.fingerprintLock = fingerprintLock;
        this.cardCapacity = cardCapacity;
    }

    @Override
    public String toString() {
        return "Color: " + color + ", Fingerprint Lock: " + fingerprintLock + ", Card Capacity: " + cardCapacity;
    }
}



