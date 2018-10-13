package model;

import javafx.scene.canvas.GraphicsContext;

public interface HouseBuilder {

    void buildBasement();
    void buildWalls();
    void buildRoof();
    void buildTree();
    void buildOpening();
    House getHouse();
}
