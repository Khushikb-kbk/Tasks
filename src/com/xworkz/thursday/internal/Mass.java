package com.xworkz.thursday.internal;

public class Mass extends Neutron
{
    public void symbol(Neutron neutron){
        neutron.collapse();


        if(neutron instanceof Mass){
            System.out.println("Is mass ");
            Mass mass = (Mass) neutron;
            mass.run();

            neutron.fuse();
            neutron.expand();
            neutron.collapse();
            neutron.incorporate();
            neutron.emit();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}



