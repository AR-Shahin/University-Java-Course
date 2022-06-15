package com.example.courseproject;

import file.FileHandle;
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
    protected FileHandle fileHandle;
    public HelloController(){
        this.fileHandle = new FileHandle();
    }

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
        String inputName = name.getText();
        String inputId = id.getText();

        String format = inputName + ";" + inputId +"\n";
        this.fileHandle.setDataIntoFile(format);
        clearRegistrationForm();
    }

    private void clearRegistrationForm(){
        name.setText("");
        id.setText("");
    }
    @FXML
    void handleSearch(ActionEvent event) {
        String id = searchField.getText();
       String result =  this.fileHandle.getDataFromFile(id);
       if(result == "NOT_EXITS"){
           display.setText("Invalid ID");
       }else {
           String format = "Name " + result.split(";")[0] +  "\nID " + result.split(";")[1];
           display.setText(format);
       }
    }


}