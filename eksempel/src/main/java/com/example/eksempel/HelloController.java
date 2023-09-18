package com.example.eksempel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
    void trykkMeg(ActionEvent event) {
        String fornavn = txtFornavn.getText();
        String etternavn = txtEtternavn.getText();
        String navn = fornavn + " "+ etternavn;
        lblnavn.setText(navn);


    }

}
