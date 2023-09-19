package com.example.eksempel3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class HelloController {

    @FXML
    private ToggleGroup gruppe1;

    @FXML
    private Label lblUt;

    @FXML
    void radioSjekk(ActionEvent event) {
        RadioButton valgtKnapp = (RadioButton) gruppe1.getSelectedToggle();
        String radioKnapp = valgtKnapp.getText();
        if (radioKnapp.equals("Knapp1")){
            lblUt.setText("Knapp 1 er valgt");
        }
        if (radioKnapp.equals("Knapp2")){
            lblUt.setText("Knapp 2 er valgt");
        }

    }

}
