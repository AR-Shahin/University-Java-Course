package com.example.coursefx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class HelloController {
    @FXML
    private AnchorPane mainPane;
    @FXML
    private Label welcomeText;

    @FXML
    private Label title;

    @FXML
    private TextField nameField;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void handleClickMeButton(ActionEvent event) {
        title.setText("I am changed by clicking button!");
        String data = title.getText();
        System.out.println("Hello World");
    }
}