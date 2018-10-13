package model;

import javafx.scene.canvas.GraphicsContext;

public class Director {

    public House build(HouseBuilder builder) {

        builder.buildBasement();
        builder.buildWalls();
        builder.buildRoof();// можно без
        builder.buildTree();
        return builder.getHouse();
    }
}
