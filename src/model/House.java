package model;

import javafx.scene.canvas.GraphicsContext;

import java.util.LinkedList;
import java.util.List;

public class House {

    private Basement basement;
    private Wall walls;
    private Roof roof;
    private Tree tree;
    private Opening opening;

 //   public void addWall(Wall wall){
    //    this.walls.add(wall);
   // }
    public void setWalls(Wall wall){this.walls=wall;}
    public void setRoof(Roof roof){
        this.roof=roof;
    }
    public void setBasement(Basement basement) {
        this.basement = basement;
    }
    public void setTree(Tree tree){
        this.tree=tree;
    }
    public void setOpening(Opening opening){this.opening=opening;}
    public String toString() {
        return "House {" + this.basement + ", " + this.walls + ", " +
                this.roof +", "+this.tree+ ", "+this.opening+"}";
    }
    public void draw(GraphicsContext gr){
        basement.draw(gr);
        tree.draw(gr);
        walls.draw(gr);
        roof.draw(gr);
        opening.draw(gr);
    }


}
