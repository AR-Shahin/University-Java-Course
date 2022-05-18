package controller;

import app.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class DonorDashboardController {
    @FXML
    private Application app;
    public DonorDashboardController(){
        this.app = new Application();
    }
    @FXML
    void handleLogout(ActionEvent event) throws Exception {
        this.app.changeScreen(event,"login","Login",false,"");
    }
}
