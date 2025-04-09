package com.xworkz.wednesday.internal;

public class Student {
    private int rollNo;
    private String name;
    private int age;

    public Student(int rollNo, String name, int age){
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Roll No :"+rollNo+" Name : "+name+" Age : "+age;
    }
}


