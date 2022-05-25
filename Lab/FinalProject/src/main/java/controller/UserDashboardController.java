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
import model.BloodRequest;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class UserDashboardController extends Utility implements HasData, Initializable {
    @FXML
    private Application app;
    private BloodRequest bloodRequest;
    protected String data,bloodType;
    @FXML
    private ToggleGroup blood;
    @FXML
    private TextArea display,myRequests;

    @FXML
    private Pane bloodPane,homePane,requestPane;
    public UserDashboardController(){
        this.app = new Application();
        this.bloodRequest = new BloodRequest();
    }
    public void initialize(URL url, ResourceBundle resourceBundle){

        bloodPane.setVisible(false);
        requestPane.setVisible(false);
    }
    @FXML
    void goToRequestPane(ActionEvent event) {
        requestPane.setVisible(true);
        homePane.setVisible(false);
        bloodPane.setVisible(false);
        this.myRequests.setText(this.getMyRequests());
    }

    private String getMyRequests(){
        String data = "Empty!!";
        int id = Integer.parseInt(this.data.split(";")[0]);

        ResultSet res = this.bloodRequest.getUserBloodRequests(id);
        try {
            if(res.next()){
                data  = "";
//                data += res.getString("name") + "\t" + res.getString("email") + "\n";
            }

            while (res.next()){
                data += res.getString("id") + "\t" + res.getString("blood") + "\n";
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return data;
    }
    @FXML
    public void goToHome(ActionEvent event) {
        homePane.setVisible(true);
        bloodPane.setVisible(false);
        requestPane.setVisible(false);
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
        requestPane.setVisible(false);
    }

    @FXML
    public void handleBloodRequest(ActionEvent event) {
        this.setBloodType();
        int id = Integer.parseInt(this.data.split(";")[0]);
        this.bloodRequest.user_id = id;
        this.bloodRequest.blood = this.bloodType;
        this.bloodRequest.status = true;
        try {
            if(this.bloodRequest.store()){
                this.goToRequestPane(event);
                print("REQUEST SENT");
            }else {
                print("Errr");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
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
