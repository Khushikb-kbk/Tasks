package com.xworkz.march;

public class ShopRunner
{
    public static void main(String[] args){
        String value="owner@shop.com";

        Display display=new Display();
        Shop shop=new Shop();
        shop.ads(display);
        shop.ownerEmail(value);
    }
}
