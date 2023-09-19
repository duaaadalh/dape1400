package com.example.eksempel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Label lblnavn;

    @FXML
    private TextField txtEtternavn;

    @FXML
    private TextField txtFornavn;

    @FXML
    private CheckBox chxMelk;

    @FXML
    private CheckBox chxSmor;

    @FXML
    void trykkMeg(ActionEvent event) {
        String ut = "";
        String fornavn = txtFornavn.getText();
        String etternavn = txtEtternavn.getText();
        ut = fornavn + " "+ etternavn + " har bestilt følgende varer : ";
        if (chxSmor.isSelected()){
            ut += " smør ";
        }
        if (chxMelk.isSelected()){
            ut += " melk ";
        }


        lblnavn.setText(ut);


    }

}
