package controller;

import app.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginController {
    private Application app;
    public LoginController(){
         this.app = new Application();
    }
    @FXML
    private TextField email;

    @FXML
    private TextField password;

    @FXML
    void handleLogin(ActionEvent event) throws Exception {
        this.app.changeScreen(event,"dashboard","Dashboard",true,email.getText());
    }

    @FXML
    public void openDonorRegistrationScene(ActionEvent event) throws Exception{
        this.app.changeScreen(event,"registration","Registration",true,"Regis");
    }
    public void print(Object obj){

        System.out.println(obj);
    }

    @FXML
    public void dash(ActionEvent event) throws Exception {
        this.app.changeScreen(event,"donor_dashboard","Donor dashboard",false,"");
    }
}
