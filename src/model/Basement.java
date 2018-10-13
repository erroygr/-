package model;

import javafx.scene.canvas.GraphicsContext;

public class Basement implements Item {

    public String toString(){
        return "Basement";

    }
    @Override
    public void draw(GraphicsContext gr) {
        System.out.println("Рисую подвал");
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
