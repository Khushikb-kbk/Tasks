package com.xworkz.Accessors;

public class Cosmic
{
    public void display(Cosmic cosmic) {
        Alien alien = new Alien();
        System.out.println("cosmic");
        System.out.println("Seen By: " + alien.getSeenBy());
        alien.setSeenBy("khushi");
        System.out.println("Seen Date: " + alien.getSeenDate());
        alien.setSeenDate("bangalore");
        System.out.println("Jailer Name: " + alien.getDescribe());
        alien.setDescribe("Manja");


    }

}


