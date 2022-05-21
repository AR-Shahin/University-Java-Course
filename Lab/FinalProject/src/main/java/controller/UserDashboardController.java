package controller;

import Helper.Utility;
import app.Application;
import interfaces.HasData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class UserDashboardController extends Utility implements HasData, Initializable {
    @FXML
    private Application app;
    protected String data,bloodType;
    @FXML
    private ToggleGroup blood;
    @FXML
    private TextArea display;

    @FXML
    private Pane bloodPane,homePane;
    public void initialize(URL url, ResourceBundle resourceBundle){

        bloodPane.setVisible(false);
    }
    @FXML
    public void goToHome(ActionEvent event) {
        homePane.setVisible(true);
        bloodPane.setVisible(false);
    }
    public UserDashboardController(){
        this.app = new Application();
    }
    @FXML
    void handleLogout(ActionEvent event) throws Exception {
        this.app.changeScreen(event,"login","Login",false,"");
    }
    public void sendData(String data){
        this.data = data;
        display.setText(this.modifyDataToDisplay(this.data));
    }

    public void requestForBlood(ActionEvent event){
        homePane.setVisible(false);
        bloodPane.setVisible(true);
    }

    @FXML
    public void handleBloodRequest(ActionEvent event) {
        this.setBloodType();
        print(this.bloodType + this.data.split(";")[0]);
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
