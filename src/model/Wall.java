package model;

import javafx.scene.canvas.GraphicsContext;

public class Wall implements Item {
    @Override
    public void draw(GraphicsContext gr) {
        System.out.println("Рисую стену");
    }

    public String toString(){
        return "Wall";

    }

    @Override
    public float price() {
        return 66;
    }
}
