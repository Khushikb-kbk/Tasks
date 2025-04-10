package com.xworkz.wednesday.internal;

public class Boat
{
    private String type;
    private int capacity;
    private boolean motorized;

    public Boat(String type, int capacity, boolean motorized) {
        this.type = type;
        this.capacity = capacity;
        this.motorized = motorized;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Capacity: " + capacity + " people, Motorized: " + motorized;
    }
    @Override
    public int hashCode() {
        return 130;
    }
}


