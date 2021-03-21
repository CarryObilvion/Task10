package sample.Metods;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;

/**
 * Класс для рисования текста внутри
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.2
 */

public class TextInside extends Decoration {
    public Line[] lines = new Line[4];
    Color[] c = new Color[]{Color.RED, Color.YELLOW, Color.GREEN, Color.BLUE};

    public TextInside(Rectangle egg) {
        super(egg);
    }

    public void draw(Pane paneTape) {
        super.draw(paneTape);
        drawTape(paneTape);
    }

    ;

    private void drawTape(Pane paneTape) {
        lines[0] = new Line(45, 45, 235, 150);
        lines[1] = new Line(40, 55, 230, 160);
        lines[2] = new Line(30, 270, 220, 270);
        lines[3] = new Line(35, 280, 215, 280);

        for (int i = 0; i < 4; i++) {
            lines[i].setStrokeWidth(10);
            lines[i].setStroke(c[i]);
        }


        paneTape.getChildren().addAll(lines[0], lines[1], lines[2], lines[3]);
    }
}