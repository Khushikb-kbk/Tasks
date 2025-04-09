package com.xworkz.wednesday.internal;

public class Job
{
    private String title;
    private String company;
    private double salary;

    public Job(String title, String company, double salary){
        this.title = title;
        this.company = company;
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Title :"+title+" Company : "+company+" Salary : "+salary;
    }
}




