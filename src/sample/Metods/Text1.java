package sample.Metods;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public  class Text1 extends Decoration {

  public Label label2 = new Label("Библиотека");
    public Rectangle Square = new Rectangle();


  public Text1(Block block) {
      super(block);
  }
  public void draw(Pane paneTape) {
      super.draw(paneTape);
      drawTape(paneTape);
  }

  private void drawTape(Pane paneTape) {
      Square = new Rectangle(80, 130, 150, 70);
      Square.setFill(Color.WHITE);
      label2.setLayoutY(165);
      label2.setLayoutX(125);
      paneTape.getChildren().addAll(Square);
      paneTape.getChildren().addAll(label2);
  }

}
