package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

//крыша
public class Roof implements Item {
    @Override
    public void draw(GraphicsContext gr) {

        gr.setFill(Color.RED);
        gr.setStroke(Color.BLACK);
        gr.fillPolygon(new double[]{25, 100,105},
                new double[]{50,70,10},3
        );
        gr.strokePolygon(new double[]{100,105},
                new double[]{70,10},2);

        gr.fillPolygon(new double[]{100, 175,105},
                new double[]{70,50,10},3
        );

    }

    @Override
    public float price() {
        return 87;
    }
    public String toString(){
        return "Roof";

    }
}
