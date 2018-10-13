package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.GraphicsContext;
import model.Director;
import model.House;
import model.HouseBuilder;
import model.SimpleHouseBuilder;
import javafx.scene.canvas.Canvas;
import model.Tree;

import java.awt.*;

public class Controller {

    @FXML
    public Canvas can;

    public void addPict(){
        GraphicsContext gr = can.getGraphicsContext2D();

        Director houseBuildingCompany = new Director();
        HouseBuilder builder = new SimpleHouseBuilder();
        houseBuildingCompany.build(builder);
        House house = houseBuildingCompany.build(builder);


       house.draw(gr);

        // String hou=String.
       // System.out.println(house);
        //rrr.getItems().add(house);
      // rrr.add(house.toString(house));
    }

    public void clearPic(){
        GraphicsContext gr = can.getGraphicsContext2D();
        gr.clearRect(0, 0, 400, 250);
    }

}
