package com.xworkz.thursday.internal;

public class SQL extends Database{
    public SQL() {
        System.out.println("sql");
    }
@Override
    public  void execute() {

        System.out.println("execute");
    }
@Override
    public  void create() {
        System.out.println("create");
    }
@Override
    public void insert() {

        System.out.println("insert");
    }
@Override
    public  void delete() {
        System.out.println("delete");
    }
@Override
    public void close(){
        System.out.println("close");



    }
}





