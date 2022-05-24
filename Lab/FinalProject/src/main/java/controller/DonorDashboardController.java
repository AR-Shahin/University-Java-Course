package controller;

import Helper.Utility;
import app.Application;
import interfaces.HasData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import model.BloodRequest;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DonorDashboardController extends Utility implements HasData, Initializable {
    @FXML
    private Application app;
    private BloodRequest bloodRequest;
    protected String data;
    @FXML
    public TextArea display;
    @FXML
    public TextArea requestDisplay;

    @FXML
    private Pane homePane,requestPane;

    public DonorDashboardController(){
        this.app = new Application();
        this.bloodRequest = new BloodRequest();
    }
    public void initialize(URL url, ResourceBundle resourceBundle){
        requestPane.setVisible(false);
    }

    @FXML
    void goToHomePane(ActionEvent event) {
        requestPane.setVisible(false);
        homePane.setVisible(true);
    }

    @FXML
    public void goToRequestPane(ActionEvent event) {

        requestPane.setVisible(true);
        homePane.setVisible(false);
        requestDisplay.setText(this.donorBloodRequests());

    }
    @FXML
    private String donorBloodRequests(){
        String data = "Empty!!";
        String blood = this.data.split(";")[5];

        ResultSet res = this.bloodRequest.getUserBloodRequests(blood);
        try {
            if(res.next()){
                data  = "";
            }
            data += res.getString("name") + "\t" + res.getString("email") + "\n";
            while (res.next()){
                data += res.getString("name") + "\t" + res.getString("email") + "\n";
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return data;
    }
    @FXML
    void handleLogout(ActionEvent event) throws Exception {
        this.app.changeScreen(event,"login","Login",false,"");
    }
    public void sendData(String data){
        this.data = data;
        display.setText(this.modifyDataToDisplay(this.data));
    }
}
