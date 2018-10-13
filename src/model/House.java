package model;

import java.util.LinkedList;
import java.util.List;

public class House {

    private Basement basement;
    private List<Wall> walls;
    private Roof roof;
    private Tree tree;

    public House(){
        this.walls=new LinkedList<Wall>();
    }
    public void addWall(Wall wall){
        this.walls.add(wall);
    }

    public void setRoof(Roof roof){
        this.roof=roof;
    }
    public void setBasement(Basement basement) {
        this.basement = basement;
    }
    public void setTree(Tree tree){
        this.tree=tree;
    }

    public String toString() {
        return "House {" + this.basement + ", " + this.walls + ", " +
                this.roof +", "+this.tree+ "}";
    }


}
