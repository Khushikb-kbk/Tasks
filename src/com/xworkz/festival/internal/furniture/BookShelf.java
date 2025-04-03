package com.xworkz.festival.internal.furniture;

    public class BookShelf extends Furniture {
        public void storeBooks() {
            super.assemble();
            super.disassemble();
            super.clean();
            super.move();
            super.repair();
            System.out.println("Bookshelf storing books");
        }
    }

