package sample.Metods;

import javafx.scene.layout.Pane;

/**
 * Абстрактный класс, реализующий интерфейс Rectangle
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.2
 */

public abstract class Decoration implements Rectangle {
    private Rectangle egg;

    public Decoration(Rectangle egg) {
        this.egg = egg;
    }

    public void draw(Pane pane) {
        egg.draw(pane);
    }
}
