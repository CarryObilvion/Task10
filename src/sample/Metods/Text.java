package sample.Metods;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import java.awt.*;

public class Text extends Decoration {
    public Label label1 = new Label("Модуль");
    public Rectangle Square = new Rectangle();

    public Text(Block block) {
        super(block);
    }
    public void draw(Pane paneTape) {
        super.draw(paneTape);
        drawTape(paneTape);
    }

    private void drawTape(Pane paneTape) {
        Square = new Rectangle(90, 140, 150, 70);
        Square.setFill(Color.WHITE);
        label1.setLayoutY(165);
        label1.setLayoutX(135);
        paneTape.getChildren().addAll(Square);
        paneTape.getChildren().addAll(label1);
    }

}

