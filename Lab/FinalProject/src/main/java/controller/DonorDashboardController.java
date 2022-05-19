package controller;

import Helper.Logger;
import app.Application;
import interfaces.HasData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class DonorDashboardController extends Logger implements HasData {
    @FXML
    private Application app;
    public DonorDashboardController(){
        this.app = new Application();
    }
    @FXML
    void handleLogout(ActionEvent event) throws Exception {
        this.app.changeScreen(event,"login","Login",false,"");
    }
    public void sendData(String data){
        print(data);
    }
}
