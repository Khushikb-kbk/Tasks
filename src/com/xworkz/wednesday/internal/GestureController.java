package com.xworkz.wednesday.internal;

public class GestureController
{
    private String deviceName;
    private int range;
    private boolean hapticFeedback;

    public GestureController(String deviceName, int range, boolean hapticFeedback) {
        this.deviceName = deviceName;
        this.range = range;
        this.hapticFeedback = hapticFeedback;
    }

    @Override
    public String toString() {
        return "Device: " + deviceName + ", Range: " + range + " cm, Haptic Feedback: " + hapticFeedback;
    }
    @Override
    public int hashCode() {
        return 320;
    }

}



