package controller;

import app.Application;
import interfaces.HasData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class RegistrationController implements HasData {
    private Application app;

    public RegistrationController(){
        this.app = new Application();
    }
    @FXML
    private TextField name;
    @FXML
    private TextField age;

    @FXML
    private ToggleGroup blood;

    @FXML
    private ToggleGroup blood1;

    @FXML
    private ToggleGroup blood11;

    @FXML
    private ToggleGroup blood111;

    @FXML
    private TextField email;

    @FXML
    private PasswordField password;

    @FXML
    void goToLoginScene(ActionEvent event) throws Exception {
        this.app.changeScreen(event,"login","Login",false,"");
    }
    @Override
    public void sendData(String data){
        name.setText(data);
    }
}
