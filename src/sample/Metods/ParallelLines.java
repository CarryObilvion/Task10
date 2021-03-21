package sample.Metods;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * Класс для рисования линий
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.2
 */

public class ParallelLines extends Decoration {
    public Circle[] circle = new Circle[7];

    public ParallelLines(Rectangle egg) {
        super(egg);
    }

    public void draw(Pane paneLight) {
        super.draw(paneLight);
        drawBeads(paneLight);
    }

    private void drawBeads(Pane panelight) {
        circle[0] = new Circle(35, 70, 8, Color.RED);
        circle[1] = new Circle(35, 170, 8, Color.BLUE);
        circle[2] = new Circle(35, 255, 8, Color.YELLOW);
        circle[3] = new Circle(130, 150, 8, Color.YELLOW);
        circle[4] = new Circle(130, 230, 8, Color.BLUE);
        circle[5] = new Circle(215, 170, 8, Color.RED);
        circle[6] = new Circle(215, 255, 8, Color.BLUE);
        panelight.getChildren().addAll(circle[0], circle[1], circle[2], circle[3], circle[4], circle[5], circle[6]);
    }
}