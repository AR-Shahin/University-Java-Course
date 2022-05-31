package com.example.coursefx;

import helper.Utility;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AnotherController {
    public HelloApplication  h;
    public AnotherController(){
        h = new HelloApplication();
    }
    @FXML
    private TextArea display;
    private String data = null;
    @FXML
    void goToHome(ActionEvent event) throws IOException {
        this.h.changeScene(event,"root.fxml");
//        FXMLLoader loader = new FXMLLoader();
//        Stage stage = (Stage)( (Node) event.getSource()).getScene().getWindow();
//        Parent root = loader.load(getClass().getResource("root.fxml").openStream());
//
//        Scene scene = new Scene(root);
//        stage.setTitle("Home Page");
//        stage.setScene(scene);
//        stage.show();
    }

    public void setData(String data){
        this.data = data;

        if(this.isPrime(Integer.parseInt(this.data))){
            this.display.setText("Prime Number!");
        }else{
            this.display.setText("Not Prime Number!");
        }
        System.out.println(this.data);
    }

    public boolean isPrime(int n){
        for(int i =2;i<n;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
