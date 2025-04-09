package com.xworkz.wednesday.internal;

public class Course {
    private String title;
    private int durationWeeks;
    private boolean online;

    public Course(String title, int durationWeeks, boolean online) {
        this.title = title;
        this.durationWeeks = durationWeeks;
        this.online = online;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Duration: " + durationWeeks + " weeks, Online: " + online;
    }
}

