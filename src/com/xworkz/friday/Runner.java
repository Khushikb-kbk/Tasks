package com.xworkz.friday;

public class Runner
{

    public static void main(String[] args) {
            TShirt tshirt1=new TShirt('7',"nike",23);
            TShirt tshirt2=new TShirt('7',"nike",23);
            boolean same=tshirt1.equals(tshirt2);
            System.out.println("the product of tshirt is "+same);

        }
    }

