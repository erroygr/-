package model;

import javafx.scene.canvas.GraphicsContext;

public class Roof implements Item {
    @Override
    public void draw(GraphicsContext gr) {
        System.out.println("Рисую крышу");
    }

    @Override
    public float price() {
        return 87;
    }
    public String toString(){
        return "Roof";

    }
}
