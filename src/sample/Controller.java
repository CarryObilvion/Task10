package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import sample.Metods.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public Block block;
    public Pane pain;
    public ChoiceBox<String> choise;


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        ObservableList list = FXCollections.observableArrayList("Модуль", "Библиотека", "Подсистема");
        choise.setItems(list);
        choise.getSelectionModel().selectFirst(); //добавил слушатель
        choise.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number number2) {
                choise.getItems().get((Integer) number2);
            }
        });
    }
    public void DrawInside(ActionEvent actionEvent) {

        String value1 = choise.getValue();
        int i = 0;
        if (value1 == "Модуль") {
            i = 1;
        }
        String value2 = choise.getValue();
        if (value2 == "Библиотека") {
            i = 2;
        }
        String value3 = choise.getValue();
        if (value3 == "Подсистема") {
            i = 3;
        }

        if (i == 1) {

                pain.getChildren().clear();

            pain.toFront();
            block = new Square(new Block() {
                @Override
                public void draw(Pane pane) {

                }
            });
            block.draw(pain);


        }


        if (i == 2) {
            pain.getChildren().clear();
            pain.toFront();
            block = new VertLines(new Block() {
                @Override
                public void draw(Pane pane) {

                }
            });
            block.draw(pain);
        }
        if (i == 3) {
            pain.getChildren().clear();
            pain.toFront();
            block = new HorizLines(new Block() {
                @Override
                public void draw(Pane pane) {

                }
            });
            block.draw(pain);
        }


    }

    public void Text(ActionEvent actionEvent) {
        String value1 = choise.getValue();
        int i = 0;
        if (value1 == "Модуль") {
            i = 1;
        }
        String value2 = choise.getValue();
        if (value2 == "Библиотека") {
            i = 2;
        }
        String value3 = choise.getValue();
        if (value3 == "Подсистема") {
            i = 3;
        }

        if (i == 1) {



            pain.toFront();
            block = new Text(new Block() {
                @Override
                public void draw(Pane pane) {

                }
            });
            block.draw(pain);
        }
        if (i == 2) {
            pain.toFront();
            block = new Text1(new Block() {
                @Override
                public void draw(Pane pane) {

                }
            });
            block.draw(pain);

        }
        if (i == 3) {
            pain.toFront();
            block = new Text2(new Block() {
                @Override
                public void draw(Pane pane) {

                }
            });
            block.draw(pain);

        }
    }







    public void clean(ActionEvent actionEvent) {
        pain.getChildren().clear();
    }
}














