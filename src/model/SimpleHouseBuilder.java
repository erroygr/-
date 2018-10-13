package model;

import javafx.scene.canvas.GraphicsContext;

public class SimpleHouseBuilder implements HouseBuilder {

    private House house;

    public SimpleHouseBuilder() {
        this.house = new House();
    }
    public void buildBasement() {
        this.house.setBasement(new Basement());
    }
    public void buildWalls() {
        for (int i = 0; i < 4; i++)
            this.house.addWall(new Wall());
    }
    public void buildRoof() {
        this.house.setRoof(new Roof());
    }
    public void buildTree(){
        this.house.setTree(new Tree());
    }
    public House getHouse() {
        return this.house;
    }
}
