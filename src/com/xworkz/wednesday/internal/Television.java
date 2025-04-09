package com.xworkz.wednesday.internal;

public class Television {
    private String type;
    private int size;
    private boolean smart;

    public Television(String type, int size, boolean smart) {
        this.type = type;
        this.size = size;
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "Type: " + type + ", Size: " + size + " inch, Smart: " + smart;
    }
}
