package controller;

import Helper.Utility;
import app.Application;
import interfaces.HasData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import model.User;

import java.sql.SQLException;

public class RegistrationController extends Utility implements HasData {
    private Application app;
    private User user;

    public RegistrationController(){
        this.app = new Application();
        this.user = new User();
    }
    @FXML
    private TextField age,email,name,phone;

    protected String userTypeData,bloodType;
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

    }

    @FXML
    void handleRegistration(ActionEvent event) throws Exception {
        this.setBloodType();
        this.setUserTypeData();
        this.user.name = name.getText();
        this.user.email = email.getText();
        this.user.password = password.getText();
        this.user.age = age.getText();
        this.user.phone = phone.getText();
        this.user.blood = this.bloodType;
        this.user.type = this.userTypeData;

        if(this.user.addDonor()){
            app.changeScreen(event,"login","Login",false,"");
        }else{
            print("NO");
        }

    }
    protected void setUserTypeData(){
        RadioButton selectedRadioButton = (RadioButton) type.getSelectedToggle();
        String data = selectedRadioButton.getText();

        if(data.equals("User")){
            this.userTypeData = "user";
        }else if (data.equals("Donor")){
            this.userTypeData = "donor";
        }
    }

    protected void setBloodType(){
        RadioButton selectedRadioButton = (RadioButton) blood.getSelectedToggle();
        String data = selectedRadioButton.getText();

        if(data.equals("A+")){
            this.bloodType = "A+";
        }
        else if (data.equals("A-")) {
            this.bloodType = "A-";
        }
        else if (data.equals("B+")) {
            this.bloodType = "B+";
        }
        else if (data.equals("B-")) {
            this.bloodType = "B-";
        }

    }
}
