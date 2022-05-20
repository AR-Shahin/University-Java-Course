package controller;

import Helper.Utility;
import app.Application;
import interfaces.HasData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class DonorDashboardController extends Utility implements HasData {
    @FXML
    private Application app;
    protected String data;
    @FXML
    private TextArea display;
    public DonorDashboardController(){
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
}
