package com.xworkz.thursday.internal;

public class Subscription extends Plan
{
    public Subscription() {
        System.out.println("subscription");
    }
@Override
    public  void upgrade() {

        System.out.println("upgrade");
    }
@Override
    public  void downgrade() {
        System.out.println("downgrade");
    }
@Override
    public void features() {

        System.out.println("features");
    }
@Override
    public  void renew() {
        System.out.println("renew");
    }
@Override
    public void cancel(){
        System.out.println("cancel");




    }
}









