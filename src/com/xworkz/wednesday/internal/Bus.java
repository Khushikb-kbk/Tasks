package com.xworkz.wednesday.internal;

public class Bus
{
    private String operator;
    private int seatingCapacity;
    private boolean acAvailable;

    public Bus(String operator, int seatingCapacity, boolean acAvailable) {
        this.operator = operator;
        this.seatingCapacity = seatingCapacity;
        this.acAvailable = acAvailable;
    }

    @Override
    public String toString() {
        return "Operator: " + operator + ", Seating Capacity: " + seatingCapacity + ", AC: " + acAvailable;
    }
    @Override
    public int hashCode() {
        return 134;
    }
}


