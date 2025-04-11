package com.xworkz.friday;

public class TShirt {

    private char size;
    private String brand;
    private int quantity;

    public TShirt(char size, String brand, int quantity) {
        this.size = size;
        this.brand = brand;
        this.quantity = quantity;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof TShirt) {
                System.out.println("ref is TShirt , will compare..");
                TShirt tShirt1 = this;
                TShirt tShirt2 = (TShirt) obj;
                if (tShirt1.brand.equals(tShirt2.brand) && tShirt1.size == tShirt2.size &&
                        tShirt1.quantity == tShirt2.quantity) {
                    System.out.println("both tshirts are same");
                }

                return true;

            }

        }
        return false;
    }
}




















