package com.xworkz.wednesday.internal;

public class Teacher
{
    private String name;
    private String subject;
    private double salary;

    public Teacher(String name, String subject, double salary){
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Name :"+name+" Subject : "+subject+" Salary : "+salary;
    }
    @Override
    public int hashCode() {
        return 850;
    }
}





