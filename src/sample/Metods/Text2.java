package sample.Metods;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Text2 extends Decoration {

    public Label label3 = new Label("Подсистема");
    public Rectangle Square = new Rectangle();

    public Text2(Block block) {
        super(block);
    }
    public void draw(Pane paneTape) {
        super.draw(paneTape);
        drawTape(paneTape);
    }

    private void drawTape(Pane paneTape) {
        Square = new Rectangle(73, 150, 150, 20);
        Square.setFill(Color.WHITE);
        label3.setLayoutY(165);
        label3.setLayoutX(125);
        paneTape.getChildren().addAll(Square);
        paneTape.getChildren().addAll(label3);
    }

}
