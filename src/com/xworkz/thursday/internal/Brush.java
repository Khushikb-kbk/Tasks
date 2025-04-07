package com.xworkz.thursday.internal;

public class Brush extends Painter
{
    public void clean(Painter painter){
        painter.clean_brushes();


        if(painter instanceof Brush){
            System.out.println("Is brush");
            Brush brush= (Brush) painter;
            brush.run();

            painter.sketch();
            painter.mix_colors();
            painter.exhibit_work();
            painter.paint_canvas();
            painter.clean_brushes();

        }

    }
    public void run(){

        System.out.println("Running");

    }

}



