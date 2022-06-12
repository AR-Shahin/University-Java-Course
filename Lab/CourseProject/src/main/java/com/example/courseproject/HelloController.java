package com.example.courseproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TextArea display;

    @FXML
    private TextField id;

    @FXML
    private TextField name;

    @FXML
    private Pane registerPane;

    @FXML
    private TextField searchField;

    @FXML
    private Pane searchPane;

    public void initialize(URL var1, ResourceBundle var2){
        registerPane.setVisible(false);
        searchPane.setVisible(false);
    }
    @FXML
    void openRegisterPane(ActionEvent event) {
        registerPane.setVisible(true);
        searchPane.setVisible(false);
    }

    @FXML
    void openSearchPane(ActionEvent event) {
        registerPane.setVisible(false);
        searchPane.setVisible(true);
    }

    @FXML
    void handleRegistration(ActionEvent event) {

    }

    @FXML
    void handleSearch(ActionEvent event) {

    }


}