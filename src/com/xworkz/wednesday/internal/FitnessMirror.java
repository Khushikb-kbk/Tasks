package com.xworkz.wednesday.internal;

public class FitnessMirror
{
    private String brand;
    private int height;
    private boolean aiTrainer;

    public FitnessMirror(String brand, int height, boolean aiTrainer) {
        this.brand = brand;
        this.height = height;
        this.aiTrainer = aiTrainer;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Height: " + height + " cm, AI Trainer: " + aiTrainer;
    }
}


