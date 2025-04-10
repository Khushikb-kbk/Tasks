package com.xworkz.wednesday.internal;

public class SmartStoveKnob
{
    private int temperature;
    private boolean childLock;
    private String mode;

    public SmartStoveKnob(int temperature, boolean childLock, String mode) {
        this.temperature = temperature;
        this.childLock = childLock;
        this.mode = mode;
    }

    @Override
    public String toString() {
        return "Temperature: " + temperature + "°C, Child Lock: " + childLock + ", Mode: " + mode;
    }
    @Override
    public int hashCode() {
        return 760;
    }
}


