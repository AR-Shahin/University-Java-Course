package com.example.coursefx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class NewWindowController{
    @FXML
    private Label showData;
    @FXML
    void goToBack(ActionEvent event) {

    }

    public void setData(String data){
        this.showData.setText(data);
    }
    public NewWindowController(String data){
       System.out.println(data);
    }

}
