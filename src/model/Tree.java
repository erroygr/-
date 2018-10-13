package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;


public class Tree implements Item {

    public String toString(){
        return "Tree";

    }


    public void draw(GraphicsContext gr) {
        //System.out.println("Рисую дерево");

       gr.setFill(Color.GREEN);
        //gr.setLineWidth(10);

        gr.fillPolygon(new double[]{300, 330,270},
                new double[]{50,150,150},3
        );
        gr.setFill(Color.BROWN);
        gr.fillPolygon(new double[]{290,310,310,290},
                new double[]{150,150,160,160},4
        );

    }

    @Override
    public float price() {
        return 25.0f;
    }
}
