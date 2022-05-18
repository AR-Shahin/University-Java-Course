package controller;

import app.Application;
import interfaces.HasData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements HasData, Initializable {
    private Application app;

    public DashboardController(){
        this.app = new Application();
    }
    protected String data;
    @FXML
    private TextArea display;

    @FXML
    private Pane donorPane;

    @FXML
    private Pane homePane;

    @FXML
    private Pane leftbarPane;

    @Override
    public void sendData(String data){
        display.setText(data);
    }

    public void initialize(URL url, ResourceBundle resourceBundle){
        donorPane.setVisible(false);
    }

    @FXML
    void handleLogout(ActionEvent event) throws Exception {
        this.app.changeScreen(event,"login","Login",false,"");
    }

    @FXML
    public void goToDonorScene(ActionEvent event){
        donorPane.setVisible(true);
        homePane.setVisible(false);
    }

    @FXML
    public void goToHomeScene(ActionEvent event){
        donorPane.setVisible(false);
        homePane.setVisible(true);
    }
}
