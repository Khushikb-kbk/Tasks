package com.xworkz.thursday.internal;

public class MixFruit extends Juice{
    public MixFruit() {

        System.out.println("mixfruit");

    }
    @Override
    public void orange() {
        System.out.println("calling a orange");
    }
    @Override
    public void pineapple() {
        System.out.println("a pineapple");
    }
   @Override
    public void apple() {
        System.out.println("apple");

    }
    @Override
    public void grapes() {
        System.out.println("a grapes");
    }
   @Override
    public void watermelon() {
        System.out.println("a watermelon");
    }
}





