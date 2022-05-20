package controller;

import app.Application;
import interfaces.HasData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class RegistrationController implements HasData {
    private Application app;

    public RegistrationController(){
        this.app = new Application();
    }
    @FXML
    private TextField age,email,name;

    @FXML
    private RadioButton donorType,userType;

    @FXML
    private PasswordField password;

    @FXML
    private ToggleGroup type,blood;


    @FXML
    void goToLoginScene(ActionEvent event) throws Exception {
        this.app.changeScreen(event,"login","Login",false,"");
    }
    @Override
    public void sendData(String data){
        name.setText(data);
    }
}
