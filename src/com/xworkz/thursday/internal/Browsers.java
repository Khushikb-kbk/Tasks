package com.xworkz.thursday.internal;

public class Browsers extends Web
{
    public void links(Web web){
        web.template();
        if(web instanceof Browsers){
            System.out.println("Is web a browsers");
            Browsers browsers = (Browsers) web;
            browsers.run();

            web.route();
            web.template();
            web.request();
            web.server();
            web.database();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}

