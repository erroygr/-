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
            this.house.setWalls(new Wall());
    }
    public void buildRoof() {
        this.house.setRoof(new Roof());
    }
    public void buildTree(){
        this.house.setTree(new Tree());
    }
    public void buildOpening(){this.house.setOpening(new Opening());}
    public House getHouse() {
        return this.house;
    }
}
