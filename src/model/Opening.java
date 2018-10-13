package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Opening implements Item {
    @Override
    public void draw(GraphicsContext gr) {
        //ОКНО
        gr.setFill(Color.AQUAMARINE);
        gr.fillPolygon(new double[]{45,45,80,80},
                new double[]{80,120,130,90},4
        );
        // РАМА ОКНА
        gr.setStroke(Color.BLACK);
        gr.setLineWidth(2);
        gr.strokePolygon(new double[]{45,45},
                new double[]{80,120},2
        );
        gr.strokePolygon(new double[]{45,80},
                new double[]{120,130},2
        );
        gr.strokePolygon(new double[]{80,80},
                new double[]{130,90},2
        );
        gr.strokePolygon(new double[]{45,80},
                new double[]{80,90},2
        );
        gr.strokePolygon(new double[]{62.5,62.5},
                new double[]{125,85},2
        );
        gr.strokePolygon(new double[]{45,80},
                new double[]{100,110},2
        );
        //ДВЕРЬ
        gr.setFill(Color.ROSYBROWN);
        gr.fillPolygon(new double[]{120,120,150,150},
                new double[]{115,165,157,107},4
        );


    }

    @Override
    public float price() {
        return 87;
    }
    public String toString(){
        return "Проем";

    }
}
