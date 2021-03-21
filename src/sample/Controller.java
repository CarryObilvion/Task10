package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import sample.Metods.ParallelLines;
import sample.Metods.Rectangle;
import sample.Metods.TextInside;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public Rectangle egg;
    public Pane pegg;


    public void alights(ActionEvent actionEvent) {
        pegg.toFront();
        egg = new TextInside(new Rectangle() {
            @Override
            public void draw(Pane pane) {

            }
        });
        egg.draw(pegg);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        pegg.toFront();
        egg = new Rectangle() {
            @Override
            public void draw(Pane pane) {

            }
        };
        egg.draw(pegg);
    }

    public void abeads(ActionEvent actionEvent) {
        pegg.toFront();
        egg = new ParallelLines(new Rectangle() {
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