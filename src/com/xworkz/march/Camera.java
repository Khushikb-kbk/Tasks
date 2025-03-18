package com.xworkz.march;

public class Camera{
    public void photo(Click click){
        System.out.println("running photo in click");

        if (click!=null) {

            click.photo();
            click.video();

        }
        else {
            System.out.println("seems display is null, don't pass it wont work");

        }
    }
}



