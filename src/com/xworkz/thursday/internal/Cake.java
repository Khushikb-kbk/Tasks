package com.xworkz.thursday.internal;

public class Cake extends Dessert
{
    public Cake() {
        System.out.println("dessert");
    }
@Override
    public  void prepare () {

        System.out.println("prepare");
    }
@Override
    public  void decorate() {
        System.out.println("decorate");

    }
@Override
    public void serve() {

        System.out.println("serve");
    }
@Override
    public  void taste() {
        System.out.println("taste");
    }
@Override
    public void refrigerate(){
        System.out.println("refrigerate");



    }
}














