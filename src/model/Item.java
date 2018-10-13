package model;

import javafx.scene.canvas.GraphicsContext;

public interface Item {
     String toString();
     void draw(GraphicsContext gr);
     float price();
    
}
