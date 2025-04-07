package com.xworkz.thursday.internal;

public class Hampi extends HistoricalPlace{
    public Hampi(){
        System.out.println("running place in hampi");
    }
    @Override
    public void build(){
        System.out.println("build a place");
    }
    @Override
    public void destroy(){
        System.out.println("destroy a place");
    }
    @Override
    public void construct(){
        System.out.println("construct a place");
    }
    @Override
    public void famous(){
        System.out.println("famous a place");
    }
    @Override
    public void people(){
        System.out.println("people a place");
    }

}

