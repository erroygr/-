package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Wall implements Item {
    @Override
    public  void draw(GraphicsContext gr) {


        gr.setFill(Color.GRAY);
        gr.setStroke(Color.BLACK);
        gr.fillPolygon(new double[]{25,25,100,100},
                new double[]{50,150,170,70},4
        );
        gr.strokePolygon(new double[]{100,100},
                new double[]{70,170},2);
        gr.fillPolygon(new double[]{100,100,175,175},
                new double[]{70,170,150,50},4
        );


    }

    public String toString(){
        return "Wall";

    }

    @Override
    public float price() {
        return 66;
    }
}
