package com.xworkz.wednesday.internal;

public class GamingHeadset
{
    private String brand;
    private boolean surroundSound;
    private boolean noiseCancellingMic;

    public GamingHeadset(String brand, boolean surroundSound, boolean noiseCancellingMic) {
        this.brand = brand;
        this.surroundSound = surroundSound;
        this.noiseCancellingMic = noiseCancellingMic;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Surround Sound: " + surroundSound + ", Noise Cancelling Mic: " + noiseCancellingMic;
    }
}



