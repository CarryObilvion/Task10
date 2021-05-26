package sample.Metods;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

public class HorizLines extends Decoration {
    public Rectangle Square = new Rectangle();
    public Rectangle Square1 = new Rectangle();


    public HorizLines(Block block) {
        super(block);
    }

    public void draw(Pane paneTape) {
        super.draw(paneTape);
        drawTape(paneTape);
    }



    private void drawTape(Pane paneTape) {
        Square1 = new Rectangle(58, 116, 200, 118);
        Square1.setFill(Color.WHITE);
        Square1.setStrokeWidth(5);
        Square1.setStroke(Color.BLACK);

        Square = new Rectangle(58, 135, 200, 80);
        Square.setFill(Color.WHITE);
        Square.setStrokeWidth(5);
        Square.setStroke(Color.BLACK);



        paneTape.getChildren().addAll(Square1);
        paneTape.getChildren().addAll(Square);

    }
}