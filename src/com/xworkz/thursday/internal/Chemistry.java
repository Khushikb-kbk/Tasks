package com.xworkz.thursday.internal;

public class Chemistry extends Experiment
{
    public Chemistry() {
        System.out.println("chemistry");
    }
@Override
    public  void chemicals() {

        System.out.println("chemicals");
    }
@Override
    public  void reaction() {
        System.out.println("reaction");
    }
@Override
    public void record() {

        System.out.println("visit");
    }
@Override
    public  void protection() {
        System.out.println("clearance");
    }
@Override
    public void waste(){
        System.out.println("alarm");



    }
}











