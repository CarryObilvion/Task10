package sample.Metods;

import javafx.scene.layout.Pane;

public abstract class Decoration implements Block {
    private Block block;

    public Decoration(Block block) {
        this.block = block;
    }

    public void draw(Pane pane) {
        block.draw(pane);
    }
}
