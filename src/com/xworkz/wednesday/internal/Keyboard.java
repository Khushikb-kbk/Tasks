package com.xworkz.wednesday.internal;

public class Keyboard
{
    private String type;
    private String brand;
    private int key_count;

    public Keyboard(String type, String brand, int key_count){
        this.type = type;
        this.brand = brand;
        this.key_count = key_count;
    }

    @Override
    public String toString(){
        return "Type :"+type+" Brand : "+brand+" Key_count: "+key_count;
    }
    @Override
    public int hashCode() {
        return 400;
    }
}







