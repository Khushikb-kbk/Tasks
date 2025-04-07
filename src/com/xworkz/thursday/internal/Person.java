package com.xworkz.thursday.internal;

public class Person extends Admin{
    public void job(Admin admin){
        admin.logs();
        if(admin instanceof Person){
            System.out.println("Is Admin a Person");
            Person person = (Person) admin;
            person.run();

            admin.user();
            admin.logs();
            admin.unban();
            admin.permissions();
            admin.create();

        }

    }
    public void run(){

        System.out.println("Running");

    }
}
