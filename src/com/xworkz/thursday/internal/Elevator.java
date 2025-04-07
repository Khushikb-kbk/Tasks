package com.xworkz.thursday.internal;

public class Elevator extends Building
{
    public Elevator() {
        System.out.println("elevator");
    }
@Override
    public  void open() {

        System.out.println("open");
    }
@Override
    public  void close() {
        System.out.println("close");
    }
    @Override

    public void emergency() {

        System.out.println("emergency");
    }
@Override
    public  void floor() {
        System.out.println("floor");
    }
@Override
    public void elevator(){
        System.out.println("elevator");



    }
}













