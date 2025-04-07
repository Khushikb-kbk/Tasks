package com.xworkz.thursday.internal;

public class DSLR extends Camera

{
    public DSLR() {
        System.out.println("dslr");
    }
@Override
    public  void capture() {

        System.out.println("capture");
    }
@Override
    public  void focus() {
        System.out.println("focus");
    }
@Override
    public void record() {

        System.out.println("record");
    }
@Override
    public  void lens() {
        System.out.println("lens");
    }
@Override
    public void timer(){
        System.out.println("timer");



    }
}




