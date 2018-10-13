package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
//забор
public class Basement implements Item {

    public String toString(){
        return "Basement";

    }
    @Override
    public void draw(GraphicsContext gr) {
        gr.setStroke(Color.BLACK);
        //ближний забор
        gr.strokePolygon(new double[]{25,125},
                new double[]{200,200},2);
        gr.strokePolygon(new double[]{25,125},
                new double[]{210,210},2);
        gr.strokePolygon(new double[]{25,125},
                new double[]{220,220},2);

        gr.strokePolygon(new double[]{30,30},
                new double[]{190,230},2);
        gr.strokePolygon(new double[]{40,40},
                new double[]{190,230},2);
        gr.strokePolygon(new double[]{50,50},
                new double[]{190,230},2);

        gr.strokePolygon(new double[]{95,95},
                new double[]{190,230},2);
        gr.strokePolygon(new double[]{105,105},
                new double[]{190,230},2);
        gr.strokePolygon(new double[]{115,115},
                new double[]{190,230},2);
//дальний забор

        gr.strokePolygon(new double[]{200,300},
                new double[]{100,100},2);
        gr.strokePolygon(new double[]{200,300},
                new double[]{110,110},2);
        gr.strokePolygon(new double[]{200,300},
                new double[]{120,120},2);

        gr.strokePolygon(new double[]{210,210},
                new double[]{90,130},2);
        gr.strokePolygon(new double[]{220,220},
                new double[]{90,130},2);
        gr.strokePolygon(new double[]{230,230},
                new double[]{90,130},2);

        gr.strokePolygon(new double[]{290,290},
                new double[]{90,130},2);
        gr.strokePolygon(new double[]{280,280},
                new double[]{90,130},2);
        gr.strokePolygon(new double[]{270,270},
                new double[]{90,130},2);
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
