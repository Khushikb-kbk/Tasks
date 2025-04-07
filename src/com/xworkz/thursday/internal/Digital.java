package com.xworkz.thursday.internal;

public class Digital extends Bank{
    public Digital() {
        System.out.println("digital");
    }
@Override
    public  void open () {

        System.out.println("open");
    }
@Override
    public  void close() {
        System.out.println("close");
    }
@Override
    public void deposit() {

        System.out.println("deposit");
    }
@Override
    public  void withdraw() {
        System.out.println("withdraw");
    }
@Override
    public void balance(){
        System.out.println("balance");



    }
}







