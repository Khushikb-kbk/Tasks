package com.xworkz.Accessors;


import static com.xworkz.Accessors.Orbit.LEO;

public class Space
{
    public void display(Space space) {
        Satellite satellite = new Satellite();

        System.out.println("Space");
        System.out.println("Orbit orbit: " + satellite.getOrbit());
        satellite.setOrbit(LEO);
        System.out.println("Cost: " + satellite.getCost());
        satellite.setCost(200.45);
        System.out.println("weight: " + satellite.getWeight());
        satellite.setWeight(900.24);
        System.out.println("Load Weight: " + satellite.getLoadCapacity());
        satellite.setLoadCapacity(500.28);

    }


}



