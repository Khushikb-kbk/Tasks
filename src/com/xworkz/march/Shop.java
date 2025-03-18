package com.xworkz.march;

public class Shop {

    public void ownerEmail(String email) {

        System.out.println("email:" + email);
    }

    public void ads(Display display) {
        System.out.println("running ads in Shop");
        if (display!=null) {

            display.run();
            display.execute();

        }
        else {
            System.out.println("seems display is null, don't pass it wont work");

        }
    }
}




