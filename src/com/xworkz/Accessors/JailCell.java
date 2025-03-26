package com.xworkz.Accessors;

public class JailCell {


    public void display(JailCell jailCell) {
        Jail jail = new Jail();
        System.out.println("jailCell");
        System.out.println("Jail Name: " + jail.getName());
        jail.setName("khushi");
        System.out.println("Location: " + jail.getLocation());
        jail.setLocation("bangalore");
        System.out.println("Jailer Name: " + jail.getJailerName());
        jail.setJailerName("Manja");
        System.out.println("Total Cells: " + jail.getTotalCells());
        jail.setTotalCells(70);

    }

}
