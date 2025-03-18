package com.xworkz.march;

public class BarberRunner
{
    public static void main(String[] args){
        Haircut haircut=new Haircut();
        Barber barber=new Barber();
        barber.cut(haircut);
    }
}

