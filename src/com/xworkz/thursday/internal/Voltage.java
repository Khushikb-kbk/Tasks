package com.xworkz.thursday.internal;

public class Voltage extends Battery{
    public void capacity(Battery battery){
        battery.oppo();
        if(battery instanceof Voltage){
            System.out.println("Is battery a voltage");
            Voltage voltage = (Voltage) battery;
            voltage.run();

            battery.oppo();
            battery.oneplus();
            battery.xiaomi();
            battery.apple();
            battery.vivo();

        }

    }
    public void run(){

        System.out.println("Running");

    }
}


