package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import sample.Metods.Beads;
import sample.Metods.Decoration;
import sample.Metods.EasterEgg;
import sample.Metods.Tapes;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public EasterEgg egg;
    public Pane pegg;


    public void alights(ActionEvent actionEvent) {
        pegg.toFront();
        egg = new Tapes(new EasterEgg() {
            @Override
            public void draw(Pane pane) {

            }
        });
        egg.draw(pegg);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        pegg.toFront();
        egg = new EasterEgg() {
            @Override
            public void draw(Pane pane) {

            }
        };
        egg.draw(pegg);
    }

    public void abeads(ActionEvent actionEvent) {
        pegg.toFront();
        egg = new Beads(new EasterEgg() {
            @Override
            public void draw(Pane pane) {

            }
        });
        egg.draw(pegg);
    }

    public void clean(ActionEvent actionEvent) {
        pegg.getChildren().clear();
    }
}