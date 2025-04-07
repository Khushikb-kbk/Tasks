package com.xworkz.thursday.internal;

public class Logger extends Utility
{
    public Logger() {
        System.out.println("logger");
    }
@Override
    public  void info() {

        System.out.println("info");
    }
@Override
    public  void error() {
        System.out.println("error");
    }
@Override
    public void debug() {

        System.out.println("debug");
    }
@Override
    public  void logs() {
        System.out.println("logs");
    }
@Override
    public void level(){
        System.out.println("level");



    }
}









