package com.xworkz.thursday.internal;

public class Web extends Framework {
    public Web() {
        System.out.println("web");
    }

    @Override
    public void route() {

        System.out.println("route");
    }

    @Override
    public void template() {
        System.out.println("template");
    }

    @Override
    public void request() {

        System.out.println("request");
    }

    @Override
    public void server() {
        System.out.println("server");
    }

    @Override
    public void database() {
        System.out.println("database");


    }
}


