package com.xworkz.wednesday.internal;

public class SmartTrashCan
{
    private int capacity;
    private boolean autoOpen;
    private boolean odorControl;

    public SmartTrashCan(int capacity, boolean autoOpen, boolean odorControl) {
        this.capacity = capacity;
        this.autoOpen = autoOpen;
        this.odorControl = odorControl;
    }

    @Override
    public String toString() {
        return "Capacity: " + capacity + "L, Auto Open: " + autoOpen + ", Odor Control: " + odorControl;
    }
}


