package sample.Metods;

import javafx.scene.layout.Pane;

/**
 * Абстрактный класс, реализующий интерфейс EasterEgg
 * @author Kozhevnikov Alexander pPi-171
 * @version 1.2
 */

public abstract class Decoration implements EasterEgg {
    private EasterEgg egg;

    public Decoration(EasterEgg egg) {
        this.egg = egg;
    }

    public void draw(Pane pane) {
        egg.draw(pane);
    }
}
